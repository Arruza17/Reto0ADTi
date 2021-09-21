/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 2dam
 */

public class AccountControllerImplementationMysql implements AccountControllerIFace{
    final String CREATEACC="Insert into account values(?,?,?,?,?,?,7)";
    final String CHECKACC="Select * from account where id=?";
    final String ADDCUSTOMER="Insert into customer_account values(?,?)";
    final String SEARCHMOVEMENT="Select * from movement where id=?";

    @Override
    public Customer checkAcc(String idAcc) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    @Override
    public void createAcc() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ArrayList<Movement> searchMovements(String idAcc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
