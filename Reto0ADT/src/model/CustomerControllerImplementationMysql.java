/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 2dam
 */
public class CustomerControllerImplementationMysql implements CustomerControllerIFace {

    private Connection con;
    private PreparedStatement stmt;
    BDConnection db = new BDConnection();
    private final String CREATECUSTOMER = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?,?)";
    private final String SEARCHCUSTOMER = "SELECT * FROM customer WHERE codCustomer=?";
    private final String CHECKCUSTOMERACC = "SELECT a.* FROM account a,customer_account ca,customer c WHERE c.id=ca.customers_id AND ca.accounts_id=a.id AND c.id=?";

    /**
     *
     * @param cus the customer to create
     */
    @Override
    public void createCustomer(Customer cus) {

        con = db.openConnection();

        try {

            stmt = con.prepareStatement(CREATECUSTOMER);

            stmt.setLong(1, cus.getId());
            stmt.setString(2, cus.getCity());
            stmt.setString(3, cus.getEmail());
            stmt.setString(4, cus.getFirstName());
            stmt.setString(5, cus.getLastName());
            stmt.setString(6, String.valueOf(cus.getMiddleInitial()));
            stmt.setLong(7, cus.getPhone());
            stmt.setString(8, cus.getState());
            stmt.setString(9, cus.getStreet());
            stmt.setInt(10, cus.getZip());

            stmt.executeUpdate();
        } catch (SQLException e1) {          
        } finally {
            try {
                db.closeConnection(stmt, con);
            } catch (SQLException e) {
   
            }
        }




    }

    @Override
    public Customer checkCustomer(String cusId) {

        ResultSet rs = null;
        Customer cus = null;

        con = db.openConnection();

        try {
            stmt = con.prepareStatement(SEARCHCUSTOMER);

            stmt.setLong(1, cus.getId());

            rs = stmt.executeQuery();

            if (rs.next()) {
                cus = new Customer();
                cus.setId(rs.getLong(1));
                cus.setCity(rs.getString(2));
                cus.setEmail(rs.getString(3));
                cus.setFirstName(rs.getString(4));
                cus.setLastName(rs.getString(5));
                cus.setMiddleInitial(rs.getString(6).charAt(0));
                cus.setPhone(rs.getLong(7));
                cus.setState(rs.getString(8));
                cus.setStreet(rs.getString(9));
                cus.setZip(rs.getInt(10));

            } else {
                cus = null;
            }
        } catch (SQLException e) {
        
        } finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {

                }
            }
            try {
                db.closeConnection(stmt, con);
            } catch (SQLException e) {
            }
        }

        return cus;

    }

    @Override
    public ArrayList<Account> searchAcc(String idCus) {
        ResultSet rs = null;

        ArrayList<Account> customerAccounts = new ArrayList<>();

        con = db.openConnection();

        try {

            stmt = con.prepareStatement(CHECKCUSTOMERACC);

            stmt.setString(1, idCus);

            rs = stmt.executeQuery();

            while (rs.next()) {

                Account acc = new Account();
                acc.setId(rs.getInt(1));
                acc.setBalance(rs.getDouble(2));
                acc.setBeginBalance(rs.getDouble(3));
                acc.setBeginBalanceTimestamp(rs.getTimestamp(4).toLocalDateTime());
                acc.setCreditLane(rs.getDouble(5));
                acc.setDescription(rs.getString(6));
                acc.setType(AccountType.valueOf(rs.getString(7)));

                customerAccounts.add(acc);

            }
        } catch (SQLException e) {
        } finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {

                }
            }
            try {
                db.closeConnection(stmt, con);
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }

        return customerAccounts;
    }

}
