/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import com.mycompany.mytestng.BankMs;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author tkhes
 */
public class BankMsTest {
    BankMs bankMs;
    
    public BankMsTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        bankMs=new BankMs("Chase", "Chicago", "chase@chase.com", 100, 312456895);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
 
    }
    
    @Test
    public void testBank(){
        assertEquals(bankMs.getBank(), "Chase");
    }
    
   	   @Test
    public void testBranch(){
        assertEquals(bankMs.getBranch(), "Chicago");
    }
	
	   @Test
    public void testEmail(){
        assertEquals(bankMs.getEmail(), "chase@chase.com");
    }
	
	   @Test
    public void testId(){
        assertEquals(bankMs.getId(), 100);
		}
		
		   @Test
    public void testPhone(){
        assertEquals(bankMs.getPhone(), 312456895);
    }
    
}
