package testng_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_TestNG_Program_1 {

	@BeforeSuite
	public void before_suite() {

		System.out.println("Before Suite");
	}

	@BeforeTest
	public void before_Test() {

		System.out.println("Before Test");
	}

	@BeforeClass
	public void before_Class() {
		
		System.out.println("Before Class");

	}

	@BeforeMethod
	public void before_Method() {
		
		System.out.println("Before Method");

	}

	@Test
	public void TestCase1() {
		
		System.out.println("Executed Test");

	}

	@AfterMethod
	public void After_Method() {
		
		System.out.println("After Method");

	}

	@AfterClass
	public void After_Class() {
		
		System.out.println("After Class");

	}

	@AfterTest
	public void After_Test() {
		
		System.out.println("After Test");

	}

	@AfterSuite
	public void After_suite() {
		
		System.out.println("After Suite");

	}

}
