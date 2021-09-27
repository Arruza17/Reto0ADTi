/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcDinReto0Model;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelFactoryTest {
    

    @Test
    public void testGetModel() {
        
        Model modelType;
        
        ModelFactory modelFactory= new ModelFactory();
        
         modelType=modelFactory.getModel();
        
        assertEquals(modelType,);
        
   
        
    }
    
    @Test
    public void testSameOrEquals(){
        Long long1= new Long(99l);
        Long long2=new Long(99l);
        
        //long1=long2;
        
        assertEquals("The two objects are not equal",long1, long2);
        assertSame("The two objects are not the same",long1, long2);
        
    }
    
    
    
}
