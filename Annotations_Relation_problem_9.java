package testng_package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* Class	1Test,AM,BM */ 

/* Here the @Test is a celebratity and BM and AM both are bodyguard */

public class Annotations_Relation_problem_9 {

	
	@Test
	public void First_TestCase() {
		
		System.out.println("First Test Executed");
	}
	
	@BeforeMethod
	public void Before_Methood() {

		System.out.println("Before Methods");
	}
	
	@AfterMethod
	public void After_Method() {
		
		System.out.println("After Method");

	}
}