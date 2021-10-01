/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Group
 */
public class BDConnection {

    private final ResourceBundle configFile;
    private final String db;
    private final String conn;
    private final String dbUser;
    private final String dbPass;
    private final String driver;

    /**
     *
     */
    public BDConnection() {

        configFile = ResourceBundle.getBundle("resources.config");
        db = configFile.getString("DB");
        conn = configFile.getString("Conn");
        dbUser = configFile.getString("DBUser");
        dbPass = configFile.getString("DBPass");
        driver = configFile.getString("Driver");
    }

    /**
     * 
     * @return the connection open.
     */
     public Connection openConnection() {

        Connection con = null;

        try {
            //String url = "jdbc:mysql://localhost/nombreBaseDatos";
            //con =  DriverManager.getConnection(url+"?" +"user=&password=_");

            con = DriverManager.getConnection(conn, dbUser, dbPass);

        } catch (SQLException e) {

        }
        return con;
    }

    /**
     *
     * @param stmt
     * @param con
     * @throws SQLException
     */
    public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException {

        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }

    }

}
