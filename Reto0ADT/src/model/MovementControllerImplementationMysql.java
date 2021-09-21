/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 2dam
 */
public class MovementControllerImplementationMysql implements MovementControllerIFace {

    private final String MAKEMOVEMENT = "INSERT INTO movement values(?,?,?,?,?)";
    private final BDConnection DAO = new BDConnection();

    @Override
    public void makeMovement(Movement mov) {
        try {
            Connection con = DAO.openConnection();
            PreparedStatement stmt;
            stmt = con.prepareStatement(MAKEMOVEMENT);
            stmt.setInt(1, mov.getId());
            stmt.setDate(2, mov.getTimestamp());
            stmt.setDouble(3, mov.getAmount());
            stmt.setDouble(4, mov.getBalance());
            stmt.setString(5, mov.getDescription());
            stmt.executeUpdate();
            stmt.close();
            DAO.closeConnection(stmt, con);
        } catch (SQLException ex) {
            System.out.println("ERROR");

        }

    }

}
