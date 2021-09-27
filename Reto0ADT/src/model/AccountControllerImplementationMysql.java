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
 *
 * @author 2dam
 */
public class AccountControllerImplementationMysql implements AccountControllerIFace {

    final String CREATEACC = "Insert into account values(?,?,?,?,?,?,7)";
    final String CHECKACC = "Select * from account where id=?";
    final String ADDCUSTOMER = "Insert into customer_account values(?,?)";
    final String SEARCHMOVEMENT = "Select * from movement where id=?";
    private final BDConnection DAO = new BDConnection();
    private Connection con;
    private PreparedStatement stmt;

    /**
     *
     * @param idAcc
     * @return
     */
    @Override
    public Customer checkAcc(String idAcc) {
        ResultSet rs = null;
        Customer cus = null;

        con = DAO.openConnection();

        try {
            stmt = con.prepareStatement(CHECKACC);
            stmt.setString(1, idAcc);

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

        } finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {

                }
            }
            try {
                DAO.closeConnection(stmt, con);
            } catch (SQLException e) {

            }
        }

        return cus;
    }

    /**
     *
     * @param idAcc
     * @return
     */
    @Override
    public ArrayList<Movement> searchMovements(String idAcc) {
        ArrayList<Movement> movements = new ArrayList<>();
        Movement aux;
        try {
            con = DAO.openConnection();
            ResultSet rs = null;
            stmt = con.prepareStatement(SEARCHMOVEMENT);
            stmt.setString(1, idAcc);
            rs = stmt.executeQuery(SEARCHMOVEMENT);
            if (rs != null) {
                while (rs.next()) {
                    aux = new Movement();
                    aux.setId(rs.getLong("id"));
                    aux.setDescription(rs.getString("description"));
                    aux.setTimestamp(rs.getTimestamp("timestamp").toLocalDateTime());
                    aux.setBalance(rs.getDouble("balance"));
                    aux.setAmount(rs.getDouble("amount"));
                    // aux.setAccount_id(rs.getLong("account_id"));
                    movements.add(aux);
                }
            }
            DAO.closeConnection(stmt, con);
        } catch (SQLException e) {

        }
        return movements;
    }

    @Override
    public void createAcc(Account acc) {
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
        }

    }

    @Override
    public void addCustomers(Customer cus, Account acc) {
        try {
            con = DAO.openConnection();
            stmt = con.prepareStatement(ADDCUSTOMER);
            stmt.setLong(1, cus.getId());
            stmt.setLong(2, acc.getId());
            stmt.executeUpdate();
            stmt.close();
            DAO.closeConnection(stmt, con);
        } catch (SQLException sql) {
        }

    }

}
