package testng_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/* Class	2Test,1BM,1AM,BC,AC,BS,AS */ 

/* Here the @Test is a celebratity and BM and AM both are bodyguard */

public class Annotations_Relation_problem_10 {

	
	@Test
	public void First_TestCase() {
		
		System.out.println("First Test Executed");
	}
	
	@Test
	public void Second_TestCase() {
		
		System.out.println("Second Test Executed");
	}
	
	@BeforeMethod
	public void Before_Methood() {

		System.out.println("Before Methods");
	}
	
	@AfterMethod
	public void After_Method() {
		
		System.out.println("After Method");

	}
	
	
	@BeforeClass
	public void before_Class() {
		
		System.out.println("Before Class");

	}
	
	@BeforeSuite
	public void before_suite() {

		System.out.println("Before Suite");
	}
	
	
	@AfterClass
	public void After_Class() {
		
		System.out.println("After Class");

	}
	
	
	
	@AfterSuite
	public void After_suite() {
		
		System.out.println("After Suite");

	}
}
