package testng_crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/* This can be achieve by annotation @Parameters */

/* One test cases tested over 4 browsers so here the count of test case will be 4 */

public class Launch_Browser {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launch_browser(String browserlaunch) throws InterruptedException {

		if (browserlaunch.equals("chrome")) {

			driver=new ChromeDriver();
		}

		
//		  if (browserlaunch.equals("edge")) {
//		  
//		  driver=new EdgeDriver(); 
//		  }
		  
		 /* if (browserlaunch.equals("firefox")) {
		 * 
		 * driver=new FirefoxDriver(); }
		 */
		Thread.sleep(3000);
		System.out.println("AmazonBrowser launched");
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
	
		
	}
	@AfterMethod
	public void quit() throws InterruptedException {
	driver.quit();
	
	
	}

}
