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
     *
     * @param idAcc
     * @return
     */
    
    public Customer checkAcc(String idAcc);
    
    /**
     *
     * @param acc
     */
    public void createAcc(Account acc);
    
    /**
     *
     * @param cus
     */
    public void addCustomers(Customer cus, Account acc);
    
    /**
     *
     * @param idAcc
     * @return
     */
    public ArrayList<Movement> searchMovements(String idAcc);
    
    
    
    
    
}
