package testng_package;

import org.testng.annotations.Test;

public class TestNG_FailTestCase_ByThrow {
	
	@Test
	public void test_login()
	{
		throw new NullPointerException();
	}

}
