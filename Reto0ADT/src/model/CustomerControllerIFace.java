/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Yeray
 */
public interface CustomerControllerIFace {
    
    
    //CUSTOMERS
    
    public void createCustomer(Customer cus);
    
    public Customer checkCustomer(String cusId);
    
    public  ArrayList<Account> searchAcc(String idCus, String idAcc );
    
    
    
}
