package amazon_search_dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Amazon {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launchAmazon(String browsername) throws InterruptedException {

		if (browsername.equals("chrome")) {

			driver = new ChromeDriver();
		}

		/*
		 * if (browsername.equals("edge")) {
		 * 
		 * driver = new EdgeDriver(); }
		 */
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
	}

	@AfterMethod
	public void browserquit() {

		driver.quit();
	}

}
