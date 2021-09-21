/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.Clock;
import resources.Utilidades;

/**
 *
 * @author 2dam
 */
public class Main {

    public static void main(String[] args) {
        //
        int option;
        do{
        System.out.println("Choose an option: \n 1-Create customer \n 2-Consult customer data \n 3-Consult accouts of a client\n 4-Create customer account \n 5-Add customer to an account \n 6-Consult details of an account \n 7-Make movement of an account \n 8-Consult movements of an account \n 9-Exit");
        option=Utilidades.leerInt();
        switch(option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        if(option>9||option<1){
       System.out.println("Wrong option, please choose an option between 1 to 9"); }
    }while(option!=9);
    }
}
