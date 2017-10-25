/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simob
 */
public class BureauServiceTest {
    
    public BureauServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createBureau method, of class BureauService.
     */
//    @Test
//    public void testCreateBureau() {
//        System.out.println("createBureau");
//        
//        int etage = 4;
//        String departement = "math";
//        BureauService instance = new BureauService();
//        int expResult = 1;
//        int result = instance.createBureau( etage, departement);
//        assertEquals(expResult, result);
//    }


    /**
     * Test of countDesk method, of class BureauService.
     */
    @Test
    public void testCountDesk() {
        System.out.println("countDesk");
        int etage = 3;
        BureauService instance = new BureauService();
        int expResult = 2;
        int result = instance.countDesk(etage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
