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
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * The account controller that implements MySQL server
 * @author Group
 */
public class AccountControllerImplementationMysql implements AccountControllerIFace {

    final String CREATEACC = "Insert into account values(?,?,?,?,?,?,7)";
    final String CHECKACC = "Select * from account where id=?";
    final String ADDCUSTOMER = "Insert into customer_account values(?,?)";
    final String SEARCHMOVEMENT = "select * from movement where account_id=?";
    private final BDConnection DAO = new BDConnection();
    private Connection con;
    private PreparedStatement stmt;

    /**
     * Method that allows the user to check an account
     * @param idAcc the id we want to search
     * @return the full Account
     * @throws java.lang.Exception
     */
    @Override
    public Account checkAcc(long idAcc) throws Exception {
        ResultSet rs = null;
        Account acc = null;
        con = DAO.openConnection();
        try {
            stmt = con.prepareStatement(CHECKACC);
            stmt.setLong(1, idAcc);
            rs = stmt.executeQuery();
            if (rs.next()) {
                acc = new Account();
                acc.setId(rs.getLong(1));        
                acc.setBalance(rs.getDouble(2));
                acc.setBeginBalance(rs.getDouble(3));
                acc.setBeginBalanceTimestamp(rs.getTimestamp(4).toLocalDateTime());
                acc.setCreditLane(rs.getDouble(5));
                acc.setDescription(rs.getString(6));
                acc.setType(AccountType.values()[rs.getInt(7)]);
                
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeRs(rs);
        }

        return acc;
    }

    /**
     * Method that search every movement that 1 account does
     * @param idAcc the one we want to search
     * @return every movement in a Collection
     * @throws java.lang.Exception
     */
    @Override
    public ArrayList<Movement> searchMovements(long idAcc) throws Exception {
        ArrayList<Movement> movements = new ArrayList<>();
        Movement aux;
        try {
            con = DAO.openConnection();
            ResultSet rs = null;
            stmt = con.prepareStatement(SEARCHMOVEMENT);
            stmt.setLong(1, idAcc);
            rs = stmt.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    aux = new Movement();
                    aux.setId(rs.getLong("id"));
                    aux.setDescription(rs.getString("description"));
                    aux.setTimestamp(rs.getTimestamp("timestamp").toLocalDateTime());
                    aux.setBalance(rs.getDouble("balance"));
                    aux.setAmount(rs.getDouble("amount"));
                    aux.setAccId(rs.getLong("account_id"));
                    movements.add(aux);
                }
            }
            DAO.closeConnection(stmt, con);
        } catch (SQLException e) {
            throw e;

        }
        return movements;
    }
    /**
     * Method that creates an account
     * @param acc the one we want to add
     * @throws java.lang.Exception
     */
    @Override
    public void createAcc(Account acc) throws Exception {
        try {
            con = DAO.openConnection();
            stmt = con.prepareStatement(CREATEACC);
            stmt.setLong(1, acc.getId());
            stmt.setString(2, acc.getDescription());
            stmt.setDouble(3, acc.getBalance());
            stmt.setDouble(4, acc.getBeginBalance());
            stmt.setInt(5, acc.getType().ordinal());
            stmt.setTimestamp(6, Timestamp.valueOf(acc.getBeginBalanceTimestamp()));
            stmt.executeUpdate();
            stmt.close();
            DAO.closeConnection(stmt, con);
        } catch (SQLException sql) {
            throw sql;
        }

    }
    /**
     * Method that add Customers with both id's
     * @param cus the one we want to add
     * @param acc the account id we want to add
     * @throws java.lang.Exception
     */
    @Override
    public void addCustomers(long cus, long acc) throws Exception {
        try {
            con = DAO.openConnection();
            stmt = con.prepareStatement(ADDCUSTOMER);
            stmt.setLong(1, cus);
            stmt.setLong(2, acc);
            stmt.executeUpdate();
            stmt.close();
            DAO.closeConnection(stmt, con);
        } catch (SQLException sql) {
            throw sql;
        }

    }
    /**
     * Method that closes the connection with MYSQL
     * @param rs the one we want to search
     */
    private void closeRs(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {

            }
        }
        try {
            DAO.closeConnection(stmt, con);
        } catch (SQLException e) {

        }
    }

    

}
