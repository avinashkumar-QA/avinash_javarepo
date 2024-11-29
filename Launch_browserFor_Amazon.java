package amazon_search_dimensionalddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_browserFor_Amazon {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launchAmazon(String browsername) throws InterruptedException {

		if (browsername.equals("chrome")) {

			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}

	@AfterMethod
	public void browserquit() {

		driver.quit();
	}

}
