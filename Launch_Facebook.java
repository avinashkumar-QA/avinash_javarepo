package datadriven.dataproviderfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Facebook {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launching_facebook(String browsertype) throws InterruptedException {

		switch (browsertype.toLowerCase()) {

		case "chrome":

			driver = new ChromeDriver();
			break;

		case "edge":

			driver = new EdgeDriver();
			break;
			
			default :
				
			driver = new FirefoxDriver();
			break;
		}
		

		/*
		 * driver.manage().window().maximize(); Thread.sleep(2000);
		 */
		driver.get("https://www.facebook.com");

	}

	@AfterMethod
	public void quit() {

	// driver.quit();
	}

}
