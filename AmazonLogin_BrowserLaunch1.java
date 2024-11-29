package amazon_login_dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class AmazonLogin_BrowserLaunch1 {

		WebDriver driver;

		@BeforeMethod
		@Parameters("browser")
		public void launchAmazon1(String browsername1) throws InterruptedException
		
		{

			if (browsername1.equals("chrome")) {

				driver = new ChromeDriver();
			}

			/*
			 * if (browsername.equals("edge")) {
			 * 
			 * driver = new EdgeDriver(); }
			 */
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		}

		@AfterMethod
		public void browserquit() {

			//driver.quit();
		}

	}

