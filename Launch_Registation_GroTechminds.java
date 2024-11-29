package growtechmind_registration_dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Registation_GroTechminds {
	
	
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launchAmazon1(String browsername) throws InterruptedException {

		if (browsername.equals("chrome")) {

			driver = new ChromeDriver();
		}

		/*
		 * if (browsername.equals("edge")) {
		 * 
		 * driver = new EdgeDriver(); }
		 */
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
	}

	@AfterMethod
	public void browserquit() {

		//driver.quit();
	}


}
