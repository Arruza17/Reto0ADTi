/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.AccountControllerIFace;
import model.AccountControllerImplementationMysql;
import model.AccountType;
import model.Customer;
import model.CustomerAccount;
import model.CustomerControllerIFace;
import model.CustomerControllerImplementationMysql;
import model.Movement;
import model.MovementControllerIFace;
import model.MovementControllerImplementationMysql;
import resources.Utilidades;

/**
 *
 * @author 2dam
 */
public class Main {

    private static AccountControllerIFace ifaceAcc;
    private static CustomerControllerIFace ifaceCus;
    private static MovementControllerIFace ifaceMov;

    public static void main(String[] args) {
        //

        ifaceAcc = new AccountControllerImplementationMysql();
        ifaceCus = new CustomerControllerImplementationMysql();
        ifaceMov = new MovementControllerImplementationMysql();

        int option;
        do {
            System.out.println("Choose an option: \n 1-Create customer \n 2-Consult customer data \n 3-Consult accouts of a client\n 4-Create a new account \n 5-Add customer to an account \n 6-Consult details of an account \n 7-Make movement of an account \n 8-Consult movements of an account \n 9-Exit");
            option = Utilidades.leerInt(1, 9);
            switch (option) {
                case 1:
                    createCus();
                    break;
                case 2:
                    consultCusAcc();
                    break;
                case 3:
                    consultAcc();
                    break;
                case 4:
                    createAcc();
                    break;
                case 5:
                    addCus();
                    break;
                case 6:
                    checkAcc();
                    break;
                case 7:
                    mkMovement();
                    break;
                case 8:
                    consultMv();
                    break;
            }

        } while (option != 9);
    }

    private static void createCus() {
        Customer cus = new Customer();
        System.out.println("Insert the following data \n ID of the customer:");
        cus.setId(Utilidades.leerLong());
        cus.setFirstName(Utilidades.introducirCadena("First name:"));
        cus.setLastName(Utilidades.introducirCadena("Last name:"));
        cus.setMiddleInitial(Utilidades.leerChar("Middle Initial:"));
        cus.setStreet(Utilidades.introducirCadena("Street:"));
        cus.setCity(Utilidades.introducirCadena("City:"));
        cus.setCity(Utilidades.introducirCadena("State:"));
        cus.setZip(Utilidades.leerInt("ZIP:"));
        System.out.println("Phone:");
        cus.setPhone(Utilidades.leerLong());
        cus.setEmail(Utilidades.introducirCadena("Email:"));
        try {
            ifaceCus.createCustomer(cus);
            System.out.println("Correct data insertion!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void consultCusAcc() {
        System.out.println("Insert the customers ID to consult");
        Long customerID = Utilidades.leerLong();
        try {
            Customer cus = ifaceCus.checkCustomer(customerID);
            if (cus != null) {
                System.out.println("ID\t NAME\tSURNAME\tPHONE\tEMAIL");
                System.out.println(cus.getId() + "\t" + cus.getFirstName() + "\t" + cus.getLastName() + "\t" + cus.getPhone() + "\t" + cus.getEmail());
            } else {
                System.out.println("That customer does not exist yet");
            }
        } catch (Exception e) {
            System.out.println("Error with the retreival of the data");
        }

    }

    private static void consultAcc() {
        String idClient = Utilidades.introducirCadena("Introduce the clients id to check their accounts");
        try {
            ArrayList<Account> accounts = ifaceCus.searchAcc(idClient);
            if (accounts.size() > 0) {
                System.out.println("ID\tDESC.\tBAL.\tTYPE");
                for (Account a : accounts) {
                    String type = a.getType().toString();
                    System.out.println(a.getId() + "\t" + a.getDescription() + "\t" + a.getBalance() + "\t" + type + "\t");
                }
            } else {
                System.out.println("This user has no accounts yet");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    private static void addCus() {
        try {
            CustomerAccount ca = new CustomerAccount();
            System.out.println("Introduce the following data to add a new customer to an already existing account");
            System.out.println("Account  ID");
            ca.setIdAcc(Utilidades.leerLong());
            Account acc = ifaceAcc.checkAcc(ca.getIdAcc());
            if (acc == null) {
                throw new Exception("There is no account with that id in the system");
            }
            System.out.println("User  ID:");
            ca.setIdUser(Utilidades.leerLong());
            Customer cus = ifaceCus.checkCustomer(ca.getIdUser());
            if (cus == null) {
                throw new Exception("There is no customer with that id in the system");
            }
            ifaceAcc.addCustomers(ca.getIdUser(), ca.getIdAcc());
            System.out.println("Customer added to the account successfully");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void checkAcc() {
        long idaux;
        idaux = Utilidades.leerInt("Introduce account id to check");
    }

    private static void mkMovement() {
        Movement mv = new Movement();
        System.out.println("Enter the following details of the movement:");
        System.out.println("ID:");
        mv.setId(Utilidades.leerLong());
        System.out.println("Date & time");
        mv.setTimestamp(LocalDateTime.now());
        System.out.println("Amount:");
        mv.setAmount(Utilidades.leerDouble());
        System.out.println("Balance:");
        mv.setBalance(Utilidades.leerDouble());
        mv.setDescription(Utilidades.introducirCadena("Description"));

    }

    private static void consultMv() {
        System.out.println("Introduce the id of the movement");
        long id = Utilidades.leerLong();

    }

    private static void createAcc() {
        System.out.println("Enter the ID of the customer");
        long customer = Utilidades.leerLong();
        try {
            if (ifaceCus.checkCustomer(customer) != null) {
                Account acc = new Account();
                int option;
                System.out.println("Enter the following data of the account:");
                acc.setId(Utilidades.leerInt("ID:"));
                acc.setDescription(Utilidades.introducirCadena("Description:"));
                System.out.println("Balance:");
                acc.setBalance(Utilidades.leerDouble());
                System.out.println("Credit line:");
                acc.setCreditLane(Utilidades.leerDouble());
                System.out.println("Begin balance:");
                acc.setBeginBalance(Utilidades.leerDouble());
                System.out.println("Type 0-Standard 1-Credit");
                option = Utilidades.leerInt(1, 2);
                acc.setType((option == 0 ? AccountType.STANDARD : AccountType.CREDIT));
                System.out.println("Local date");
                acc.setBeginBalanceTimestamp(LocalDateTime.now());
                ifaceAcc.createAcc(acc);
                ifaceAcc.addCustomers(customer, acc.getId());
            } else {
                System.out.println("The client does not exist, would' you like to create it first?");
                if (Utilidades.esBoolean()) {
                    createCus();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        ;

    }
}
