package testng_package;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AssertionError {
	
	@Test
	public void check_test()
	{
		
		Assert.assertEquals(false, true);
	}

}
