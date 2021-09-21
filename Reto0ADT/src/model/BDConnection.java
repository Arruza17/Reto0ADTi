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
 * @author 2dam
 */
public class BDConnection {
    
    	
	private ResourceBundle configFile;
        private String db;
	private String conn;
	private String dbUser;
	private String dbPass;
        private String driver;
	
	
	public BDConnection() {
		
		configFile = ResourceBundle.getBundle("resources.config");
                
                db = configFile.getString("DB");
		conn = configFile.getString("conn");
		dbUser = configFile.getString("DBUser");
		dbPass = configFile.getString("DBPass");
                driver = configFile.getString("Driver");
		
		
		
		}
		
	
	public Connection  openConnection(){
			
		 Connection con=null;
		
		 try {
		  //String url = "jdbc:mysql://localhost/nombreBaseDatos";
		  //con =  DriverManager.getConnection(url+"?" +"user=____&password=_____");
			 
		  con = DriverManager.getConnection(conn ,dbUser, dbPass);

		} catch (SQLException e) {
			
		 }
		return con;	
		}
	
	public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException {
		
		if (stmt != null)
			stmt.close();
		if (con != null)
			con.close();
		
	}
	
    
    
}
