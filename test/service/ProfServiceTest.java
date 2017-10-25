/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Professeur;
import java.util.List;
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
public class ProfServiceTest {
    
    public ProfServiceTest() {
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
     * Test of affectProf method, of class ProfService.
     */
//    @Test
//    public void testAffectProf() {
//        System.out.println("affectProf");
//        double salaire = 60000.0;
//        String grade = "ech12";
//        double ancienté =70.0;
//        int idBureau = 6;
//        ProfService instance = new ProfService();
//        int expResult = 1;
//        int result = instance.affectProf(salaire, grade, ancienté, idBureau);
//        assertEquals(expResult, result);
//    }

//    /**
//     * Test of findAncienProf method, of class ProfService.
//     */
//    @Test
//    public void testFindAncienProf() {
//        System.out.println("findAncienProf");
//        ProfService instance = new ProfService();
//        Professeur expResult = new Professeur("P3");
//        Professeur result = instance.findAncienProf();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }
//
//    /**
//     * Test of findProfByGrade method, of class ProfService.
//     */
//    @Test
//    public void testFindProfByGrade() {
//        System.out.println("findProfByGrade");
//        String grade = "ech10";
//        ProfService instance = new ProfService();
//        List<Professeur> result = instance.findProfByGrade(grade);
//        System.out.println("le resultat"+result);
//        // TODO review the generated test code and remove the default call to fail.
//    }
//
//    /**
//     * Test of findProfByDepartement method, of class ProfService.
//     */
//    @Test
//    public void testFindProfByDepartement() {
//        System.out.println("findProfByDepartement");
//        String departement = "biop";
//        ProfService instance = new ProfService();
//        List<Professeur> result = instance.findProfByDepartement(departement);
//        System.out.println("le resultat: "+result);
//        // TODO review the generated test code and remove the default call to fail.
//    }
//
//    /**
//     * Test of isCollocataire method, of class ProfService.
//     */
    @Test
    public void testIsCollocataire() {
        System.out.println("isCollocataire");
        String idProf1 = "p8";
        String idProf2 = "P3";
        ProfService instance = new ProfService();
        int expResult = 1;
        int result = instance.isCollocataire(idProf1, idProf2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
//
//    /**
//     * Test of swich method, of class ProfService.
//     */
    @Test
    public void testSwich() {
        System.out.println("swich");
        String idProf1 = "P1";
        String idProf2 = "P3";
        ProfService instance = new ProfService();
        int expResult = 1;
        int result = instance.swich(idProf1, idProf2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
//    
}
