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
public interface AccountControllerIFace {

    //ACCOUNTS
    /**
     * Methot that checks the account
     * @param idAcc to check
     * @return the account that is checked
     * @throws java.lang.Exception
     */
    public Account checkAcc(long idAcc) throws Exception;

    /**
     * Method that creates the account
     * @param acc to add
     * @throws java.lang.Exception
     */
    public void createAcc(Account acc) throws Exception;

    /**
     * Method that addCustomers
     * @param cus recicustomer id
     * @param acc account id
     * @throws java.lang.Exception
     */
    public void addCustomers(long cus, long acc) throws Exception;

    /**
     * Method that gives an ArrayList with all the movements within 
     * the account we recive
     * @param idAcc to search all his movements
     * @return a Collection with all his movements
     * @throws java.lang.Exception
     */
    public ArrayList<Movement> searchMovements(long idAcc) throws Exception;



}
