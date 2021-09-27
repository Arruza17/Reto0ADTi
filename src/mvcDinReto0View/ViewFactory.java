/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0View;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    
     public static View getView() {
 
        final String FILENAME = "mvcDinReto0Resources/config";
	
	ResourceBundle model;
              
        String option;
        
        model=ResourceBundle.getBundle(FILENAME);
        option = model.getString("viewType");
                
                
        return option;
        
     
 }
    
    
    
}
