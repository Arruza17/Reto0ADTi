/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0Model;

import java.util.ResourceBundle;

public class ModelFactory {
    
    public static Model getModel() {
 
        final String FILENAME = "mvcDinReto0Resources/Config";
	
	ResourceBundle model;    
        
        String option;
        
        model=ResourceBundle.getBundle(FILENAME);
        option = model.getString("modelType");
        
        Model modelInstance = null;
           
                           
          if(option.equalsIgnoreCase("file")){
                              
            System.out.println(option);
            
            Model fileImplementation =new FileModelImplementation();
              modelInstance=fileImplementation;
         
            
        }else if (option.equalsIgnoreCase("db")) {
            
             System.out.println(option);
            
             Model dbImplementation =new BDmodelImplementation();
            
            modelInstance=dbImplementation;
        }
               
        return modelInstance;
        
     
 }
    
}
