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
    /**
     * The method that allows the creation of a customer
     */
    public void createCustomer(Customer cus) throws Exception;

    public Customer checkCustomer(Long cusId ) throws Exception;

    /**
     * This method allows the user to check for all the accounts a user has
     *
     * @param idCus the id of the customer to check
     * @return collection of all the accounts the user has
     */

    public ArrayList<Account> searchAcc(String idCus) throws Exception;

}
