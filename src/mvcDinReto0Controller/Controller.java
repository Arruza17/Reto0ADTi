/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0Controller;

import mvcDinReto0Model.BDmodelImplementation;
import mvcDinReto0Model.FileModelImplementation;
import mvcDinReto0Model.Model;
import mvcDinReto0View.View;

/**
 *
 * @author 2dam
 */
public class Controller {

     private Model model;
     private View view;
     
    
    public Controller(Model model, View view){
    
       this.model=model;
       this.view=view;
       
        getGreeting(model);
        
}
    private String getGreeting(Model model) {
     
        String greeting;
        
        if(model instanceof FileModelImplementation){
             System.out.println("file");
        }
        
              
        greeting=model.getGreeting();
        
       
        
       
            
        
              
        return greeting;
    }
    
    
}


