/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    /**
     *
     * @param idAcc
     * @return
     */
    @Override
    public Customer checkAcc(String idAcc) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    /**
     *
     */
    @Override
    public void createAcc() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     */
    @Override
    public void addCustomers() {
        throw new UnsupportedOperationException("Not supported yet.");
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
            Connection con = DAO.openConnection();
            PreparedStatement stmt;
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
            rs.close();
            DAO.closeConnection(stmt, con);
        } catch (Exception e) {

        }
        return movements;
    }

}
