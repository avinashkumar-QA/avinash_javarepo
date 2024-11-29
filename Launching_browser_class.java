package dataprovider_multipleinputs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launching_browser_class {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void Launch(String browser_type) throws InterruptedException {

		if (browser_type.equals("chrome")) {

			driver = new ChromeDriver();

		}

		if (browser_type.equals("edge")) {

			driver = new EdgeDriver();

		}

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void quit() {

		// driver.quit();
	}

}
