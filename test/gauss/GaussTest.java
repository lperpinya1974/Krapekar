/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauss;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lluis_2
 */
public class GaussTest {
    
    public GaussTest() {
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
     * Test of main method, of class Gauss.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Gauss.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readData method, of class Gauss.
     */
    @Test
    public void testReadData() {
        System.out.println("readData");
        boolean expResult = false;
        boolean result = Gauss.readData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testCase method, of class Gauss.
     */
    @Test(timeout = 2000)
    public void testTestCase() {
        System.out.println("testCase");
        String expResult = "";
        Gauss.testNumber = 99999;
        Gauss.error = 1;
        String result = Gauss.testCase();
        expResult = "Menor";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of calculateNumberOfPrimes method, of class Gauss.
     */
    @Test
    public void testCalculateNumberOfPrimes() {
        System.out.println("calculateNumberOfPrimes");
        int expResult = 0;
        int result = Gauss.calculateNumberOfPrimes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPrime method, of class Gauss.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        int number = 0;
        boolean expResult = false;
        boolean result = Gauss.isPrime(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateGaussAprox method, of class Gauss.
     */
    @Test
    public void testCalculateGaussAprox() {
        System.out.println("calculateGaussAprox");
        double expResult = 0.0;
        double result = Gauss.calculateGaussAprox();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
