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
 * @author Ander
 */
public class CustomerControllerImplementationMysql implements CustomerControllerIFace {

    private Connection con;
    private PreparedStatement stmt;
    BDConnection db = new BDConnection();

    private final String CREATECUSTOMER = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?,?)";
    private final String SEARCHCUSTOMER = "SELECT * FROM customer WHERE id=?";
    private final String CHECKCUSTOMERACC = "select * from account where id in (select accounts_id from customer_account where customers_id=?)";

    /**
     * Method that creates the customer
     * @param cus the customer to create
     * @throws java.lang.Exception
     */
    @Override
    public void createCustomer(Customer cus) throws Exception {

        try {
            con = db.openConnection();
            stmt = con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?,?)");
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
            throw e1;
        } finally {

            try {
                db.closeConnection(stmt, con);
            } catch (SQLException e) {
                throw e;
            }
        }

    }

    /**
     * Method that check the customer of a certain id
     * @param cusId the one to search
     * @return the checked Customer
     * @throws Exception
     */
    @Override
    public Customer checkCustomer(Long cusId) throws Exception {

        ResultSet rs = null;
        Customer cus = null;

        con = db.openConnection();

        try {
            stmt = con.prepareStatement(SEARCHCUSTOMER);

            stmt.setLong(1, cusId);
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

            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            closeRs(rs);

        }

        return cus;

    }
    /**
     * This method allows the user to check for all the accounts a user has
     * @param idCus the id of the customer to check
     * @return collection of all the accounts the user has
     * @throws java.lang.Exception
     */
    @Override
    public ArrayList<Account> searchAcc(String idCus) throws Exception {
        ResultSet rs = null;
        ArrayList<Account> customerAccounts = null;
        con = db.openConnection();

        try {
            stmt = con.prepareStatement(CHECKCUSTOMERACC);
            stmt.setString(1, idCus);
            rs = stmt.executeQuery();
            if (rs != null) {
                customerAccounts = new ArrayList<>();
                while (rs.next()) {
                    Account acc = new Account();
                    acc.setId(rs.getLong(1));
                    acc.setBalance(rs.getDouble(2));
                    acc.setBeginBalance(rs.getDouble(3));
                    acc.setBeginBalanceTimestamp(rs.getTimestamp(4).toLocalDateTime());
                    acc.setCreditLane(rs.getDouble(5));
                    acc.setDescription(rs.getString(6));
                    acc.setType(AccountType.values()[rs.getInt(7)]);
                    customerAccounts.add(acc);
                }
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            closeRs(rs);

        }
        return customerAccounts;
    }

    private void closeRs(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {

            }
        }
        try {
            db.closeConnection(stmt, con);
        } catch (SQLException e) {

        }
    }

}
