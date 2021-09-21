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
public class CustomerControllerImplementationMysql implements CustomerControllerIFace{
    
    
    private Connection con;
	private PreparedStatement stmt;
	BDconnection db=new BDconnection();
	private final String CREATECUSTOMER = "INSERT INTO VALUES(?,?,?,?,?)";
	private final String SEARCHCUSTOMER="SELECT * FROM bankdb WHERE codCustomer=?";
	private final String CHECKCUSTOMERACC="SELECT * FROM bankdb  ";

    @Override
    public void createCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Account checkCustomer(String cusId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ArrayList<Customer> searchAcc(String idCus, String idAcc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static class BDconnection {

        public BDconnection() {
        }
    }

   
	
    
    
    
}
