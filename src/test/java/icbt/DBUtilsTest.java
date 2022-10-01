/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package icbt;

import com.mycompany.gocheeta.DBUtils;
import com.mycompany.gocheeta.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tharik
 */
public class DBUtilsTest {
    
//    public DBUtilsTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getStudent method, of class DBUtils.
//     */
//    @Test
//    public void testGetStudent() {
//        System.out.println("getCustomer");
//        String id = "1";
//        DBUtils instance = new DBUtils();
//        Customer expResult = new Customer("1", "John", "j@123", "077", "John", "123");
//        Customer result = instance.getCustomer(id);
//        assertEquals(expResult.getId(), result.getId());
//        assertEquals(expResult.getName(), result.getName());
//        assertEquals(expResult.getEmail(), result.getEmail());
//        assertEquals(expResult.getContact(), result.getContact());
//        assertEquals(expResult.getUsername(), result.getUsername());
//        assertEquals(expResult.getPass(), result.getPass());
//    }
//    
//    
//    @Test
//    public void testAddStudent() {
//        System.out.println("addStudent");
//        DBUtils instance = new DBUtils();
//        Customer customer = new Customer("999", "TestCustomer",  "Testemail",  "Testconatct",  "Testusername", "TestPass");
//        boolean expectedResult = true;
//        boolean result = instance.addCustomer(customer);
//        
//        assertEquals(expectedResult, result);
//        
//        //Check each field added properly
//        Customer resultStudent = instance.getCustomer(customer.getId());
//        assertEquals(customer.getId(), resultStudent.getId());
//        assertEquals(customer.getName(), resultStudent.getName());
//        assertEquals(customer.getEmail(), resultStudent.getEmail());
//        assertEquals(customer.getContact(), resultStudent.getContact());
//        assertEquals(customer.getUsername(), resultStudent.getUsername());
//        assertEquals(customer.getPass(), resultStudent.getPass());
//        
//        System.out.println("updateCustomert");
//        customer = new Customer("999", "TestCustomer2",  "Testemail2",  "Testconatct2",  "Testusername2", "TestPass2");
//        result = instance.updateCustomer(customer);
//        
//        assertEquals(expectedResult, result);
//        
//        //Check each field added properly
//        resultStudent = instance.getCustomer(customer.getId());
//        assertEquals(customer.getId(), resultStudent.getId());
//        assertEquals(customer.getName(), resultStudent.getName());
//        assertEquals(customer.getEmail(), resultStudent.getEmail());
//        assertEquals(customer.getContact(), resultStudent.getContact());
//        assertEquals(customer.getUsername(), resultStudent.getUsername());
//        assertEquals(customer.getPass(), resultStudent.getPass());
//        
//        System.out.println("deleteCustomer");
//        result = instance.deleteCustomer(customer.getId());
//        assertEquals(expectedResult, result);  
//    }
}

