/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.*;
import resources.Utilidades;

/**
 *
 * @author 2dam
 */
public class Main {

    public static void main(String[] args) {
        AccountControllerIFace ifaceAcc = new AccountControllerImplementationMysql();
        CustomerControllerIFace ifaceCus = new CustomerControllerImplementationMysql();
        MovementControllerIFace ifaceMov = new MovementControllerImplementationMysql();

        int option;
        do {
            System.out.println("Choose an option: \n 1-Create customer \n 2-Consult customer data \n 3-Consult accouts of a client\n 4-Create customer account \n 5-Add customer to an account \n 6-Consult details of an account \n 7-Make movement of an account \n 8-Consult movements of an account \n 9-Exit");
            option = Utilidades.leerInt(1, 9);
            switch (option) {
                case 1:
                    createCus();
                    break;
                case 2:
                    consultCus();
                    break;
                case 3:
                    consultAcc();
                    break;
                case 4:
                    createCus();
                    break;
                case 5:
                    addCus();
                    break;
                case 6:
                    addCusAcc();
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
        System.out.println("Insert the following data \n ID of the customer");
        cus.setId(Utilidades.leerInt());
        System.out.println("First name");
        cus.setFirstName(Utilidades.introducirCadena());
        System.out.println("Last name");
        cus.setLastName(Utilidades.introducirCadena());
        System.out.println("Middle Initial");
        cus.setMiddleInitial(Utilidades.leerChar());
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

    private static void consultCus() {
        System.out.println("Insert the customers ID to consult");
    }

    private static void consultAcc() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void addCus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void addCusAcc() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void mkMovement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void consultMv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
