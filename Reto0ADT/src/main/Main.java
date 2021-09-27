/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.Clock;
import model.Account;
import model.AccountControllerIFace;
import model.AccountControllerImplementationMysql;
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

    public static void main(String[] args) {
        //
        
        AccountControllerIFace ifaceAcc=new AccountControllerImplementationMysql();
        CustomerControllerIFace ifaceCus=new CustomerControllerImplementationMysql();
        MovementControllerIFace ifaceMov=new MovementControllerImplementationMysql();
        
        int option;
        do{
        System.out.println("Choose an option: \n 1-Create customer \n 2-Consult customer data \n 3-Consult accouts of a client\n 4-Create customer account \n 5-Add customer to an account \n 6-Consult details of an account \n 7-Make movement of an account \n 8-Consult movements of an account \n 9-Exit");
        option=Utilidades.leerInt();
        switch(option){
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
        if(option>9||option<1){
       System.out.println("Wrong option, please choose an option between 1 to 9"); }
    }while(option!=9);
    }

    private static void createCus() {
        Customer cus=new Customer();
        System.out.println("Insert the following data \n ID of the customer");
        cus.setId(Utilidades.leerInt());
        System.out.println("First name");
        cus.setFirstName(Utilidades.introducirCadena());
        System.out.println("Last name");
        cus.setLastName(Utilidades.introducirCadena());
        System.out.println("Middle Initial");
        cus.setMiddleInitial(Utilidades.introducirCadena());
        System.out.println("Street");
        cus.setStreet(Utilidades.introducirCadena());
        System.out.println("City");
        cus.setCity(Utilidades.introducirCadena());
        System.out.println("State");
        cus.setCity(Utilidades.introducirCadena());
        System.out.println("ZIP");
        cus.setZip(Utilidades.leerInt());
        System.out.println("Phone");
        cus.setPhone(Utilidades.leerInt());
        System.out.println(Utilidades.introducirCadena());
    }

    private static void consultCusAcc() {
        String customerID;
      System.out.println("Insert the customers ID to consult");
      customerID=Utilidades.introducirCadena();
      
    }

    private static void consultAcc() {
      String idClient;
      idClient=Utilidades.introducirCadena("Introduce the clients id to check the accounts");
        
        
    }

    private static void addCus() {
       CustomerAccount ca=new CustomerAccount();
        System.out.println("Introduce the following data");
       ca.setIdAcc(Utilidades.leerInt("ID of the account:"));
       ca.setIdUser(Utilidades.leerInt("ID of the user:"));
       
    }

    private static void checkAcc() {
       long idaux;
       idaux=Utilidades.leerInt("Introduce account id to check");
    }

    private static void mkMovement() {
       Movement mv=new Movement();
        System.out.println("Enter the following details of the movement:");
        mv.setId(Utilidades.leerInt("ID:"));
        System.out.println("Date & time");
        mv.setTimestamp(Utilidades.introducirFechaDateTime());
        System.out.println("Amount:");
        mv.setAmount(Utilidades.leerDouble());
         System.out.println("Balance:");
        mv.setBalance(Utilidades.leerDouble());
        mv.setDescription(Utilidades.introducirCadena("Description"));
        
        
    }

    private static void consultMv() {
        
        String id;
        System.out.println("Introduce the id of the movement");
        id=Utilidades.introducirCadena();
        
    }

    private static void createAcc() {
        Account acc=new Account();
        int option;
        System.out.println("Insert the following data of the account:");
        System.out.println("ID:");
        acc.setId(Utilidades.leerInt());
        System.out.println("Description:");
        acc.setDescription(Utilidades.introducirCadena());
        System.out.println("Balance:");
        acc.setBalance(Utilidades.leerDouble());
        System.err.println("Credit line:");
        acc.setCreditLane(Utilidades.leerDouble());
        System.err.println("Begin balance:");
        acc.setBeginBalance(Utilidades.leerDouble());
        System.out.println("Type 0-Standard 1-Credit");
        option=Utilidades.leerInt(0, 1);
        if(option==0){
        acc.setType("STANDARD");
        }else{
        acc.setType("CREDIT");}
        System.err.println("Local date");
        acc.setBeginBalanceTimestamp(Utilidades.introducirFechaDateTime());
        
        
        
    }
}
