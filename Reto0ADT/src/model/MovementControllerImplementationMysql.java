/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 2dam
 */
public class MovementControllerImplementationMysql implements MovementControllerIFace{
final String makeMovement="INSERT INTO movement values(?,?,?,?,?,?)";
    @Override
    public void makeMovement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
