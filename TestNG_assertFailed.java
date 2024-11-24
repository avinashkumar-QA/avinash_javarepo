package testng_package;

import org.testng.annotations.Test;

public class TestNG_assertFailed {
	
	
	@Test
	public static void fb_login()
	{
		int a=5;
		assert (a>10);
	}

}
