package testng_package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/* Class	2Test,AM */

public class Annotations_Relation_problem_5 {
	
	@Test
	public void First_TestCase() {
		
		System.out.println("First Test Executed");

	}
	
	
	@Test
	public void Second_TestCase() {
		
		System.out.println("Second Test Executed");

	}
	
	@AfterMethod
	public void After_Method() {
		
		System.out.println("After Method");

	}
	

}
