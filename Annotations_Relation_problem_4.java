package testng_package;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/* Class	BS,AS,AM */

/* This relation is not possible because one @Test annotation should be required */

public class Annotations_Relation_problem_4 {
	
	@BeforeSuite
	public void before_suite() {

		System.out.println("Before Suite");
	}
	
	@BeforeMethod
	public void before_Method() {
		
		System.out.println("Before Method");

	}
	
	@AfterSuite
	public void After_suite() {
		
		System.out.println("After Suite");

	}

}
