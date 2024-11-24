package testng_package;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/* Class	2Test,1AS, 1BS*/

public class Annotations_Relation_problem_2 {
	
	
	@BeforeSuite
	public void Before_Suites() {
		
		System.out.println("Before Suites");
	}
	
	
	@Test
	public void testcase_login() {
		
		System.out.println("TestCase Login Executed");
	}
	
	@Test
	public void testcase_logout() {
		
		System.out.println("TestCase Logout Executed");
	}
	
	
	@AfterSuite
	public void After_Suites() {
		
		System.out.println("After Suites");
	}

}
