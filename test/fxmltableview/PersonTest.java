/*
 * Dummy test class for Person. Performs no meaningful tests.
 */
package fxmltableview;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alan Hensley
 */
public class PersonTest {

   public PersonTest() {
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
    * Test of getFirstName method, of class Person.
    */
   @Test
   public void testGetFirstName() {
      System.out.println("getFirstName");
      Person instance = new Person();
      String expResult = "";
      String result = instance.getFirstName();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of setFirstName method, of class Person.
    */
   @Test
   public void testSetFirstName() {
      System.out.println("setFirstName");
      String fName = "";
      Person instance = new Person();
      instance.setFirstName(fName);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of getLastName method, of class Person.
    */
   @Test
   public void testGetLastName() {
      System.out.println("getLastName");
      Person instance = new Person();
      String expResult = "";
      String result = instance.getLastName();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of setLastName method, of class Person.
    */
   @Test
   public void testSetLastName() {
      System.out.println("setLastName");
      String fName = "";
      Person instance = new Person();
      instance.setLastName(fName);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of getPrimary method, of class Person.
    */
   @Test
   public void testGetPrimary() {
      System.out.println("getPrimary");
      Person instance = new Person();
      String expResult = "";
      String result = instance.getPrimary();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of getSecondary method, of class Person.
    */
   @Test
   public void testGetSecondary() {
      System.out.println("getSecondary");
      Person instance = new Person();
      String expResult = "";
      String result = instance.getSecondary();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of getEmail method, of class Person.
    */
   @Test
   public void testGetEmail() {
      System.out.println("getEmail");
      Person instance = new Person();
      String expResult = "";
      String result = instance.getEmail();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of setEmail method, of class Person.
    */
   @Test
   public void testSetEmail() {
      System.out.println("setEmail");
      String fName = "";
      Person instance = new Person();
      instance.setEmail(fName);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }
}