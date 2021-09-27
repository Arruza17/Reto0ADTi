/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0Main;

import mvcDinReto0Controller.Controller;
import mvcDinReto0Model.ModelFactory;
import mvcDinReto0View.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller controller = new Controller(ModelFactory.getModel(),ViewFactory.getView());
                    
        
        
       
        
       
      
        
        
    }
    
}
