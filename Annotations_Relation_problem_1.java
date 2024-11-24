package testng_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Annotations_Relation_problem_1 {
	
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


}
