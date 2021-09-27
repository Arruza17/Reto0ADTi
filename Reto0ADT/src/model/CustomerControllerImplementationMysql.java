/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author 2dam
 */
public class CustomerControllerImplementationMysql implements CustomerControllerIFace {

    private Connection con;
    private PreparedStatement stmt;
    BDConnection db = new BDConnection();
    private final String CREATECUSTOMER = "INSERT INTO VALUES(?,?,?,?,?)";
    private final String SEARCHCUSTOMER = "SELECT * FROM bankdb WHERE codCustomer=?";
    private final String CHECKCUSTOMERACC = "SELECT * FROM bankdb  ";

    /**
     *
     */
    @Override
    public void createCustomer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param cusId
     * @return
     */
    @Override
    public Customer checkCustomer(String cusId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param idCus
     *
     * @return
     */
    @Override
    public ArrayList<Account> searchAcc(String idCus) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
