package failed_testcasestestng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Browser_Concept{

	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String LaunchingBrowser) throws InterruptedException {

		if (LaunchingBrowser.equals("chrome")) {

			driver = new ChromeDriver();

		}

		if (LaunchingBrowser.equals("edge")) {

			driver = new EdgeDriver();

		}

		driver.navigate().to("https://www.google.co.in/");
		
	}
	
	
	@AfterMethod
	public void browserquit() {

		driver.quit();
	}

}
