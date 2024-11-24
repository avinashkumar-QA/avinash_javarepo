package testng_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/* By the help of invocationcount we can run same testcase at multipletimes*/

public class Run_Same_Testcase_MultipleTimes {
	
	@Test()
	public void Login()
	{
		
	}
	
	@Test()
	public void logout()
	{
		
	}
	
	@Test(priority=2, invocationCount=1, enabled=true, timeOut=1000)
	public void Registration()
	{
		ChromeDriver driver= new ChromeDriver();
	}
	
	@Test(priority=3, enabled=false)
	public void Amazon_popup()
	{
		
	}

}
