package testng_package;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* Class	1Test,1BM,1AS */

public class Annotations_Relation_problem_3 {

	@BeforeMethod
	public void Before_Methood() {

		System.out.println("Before Methods");
	}

	@Test
	public void test_amazon() {

		System.out.println("Test Amazon Executed");
	}

	@AfterSuite
	public void After_Suites() {

		System.out.println("After Suites");
	}
}
