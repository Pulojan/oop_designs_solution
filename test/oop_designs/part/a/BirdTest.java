/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_designs.part.a;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pulojan
 */
public class BirdTest {
    
    public BirdTest() {
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
     * Test of sing method, of class Bird.
     */
    @Test
    public void testSing() {
        System.out.println("sing");
        Bird instance = new Bird();
        instance.sing();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
