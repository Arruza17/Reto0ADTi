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
    
    public Customer checkAcc(String idAcc);
    
    public void createAcc();
    
    public void addCustomers();
    
    public ArrayList<Movement> searchMovements(String idAcc);
    
    
    
    
    
}
