package testng_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/* TimeOut by using parameter timeOut (will get ThreadTimeoutException) */

public class TimeOut_TestNG_Exception {
	
	@Test(timeOut=1000)
	public void Launch() {
		
		ChromeDriver driver= new ChromeDriver();
	}

}
