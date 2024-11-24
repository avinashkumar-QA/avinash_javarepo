package testng_amazon;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/* Launch and Quit the Browser */

public class Launch_And_Quit_Browser {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void Launch_Browser() throws InterruptedException {
		
		
		driver= new ChromeDriver();
		System.out.println("Launching the browser");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in");
		
	}
	
	@AfterMethod
	public void Quit_Browser() {
		
		System.out.println("Logout the browser");
		driver.quit();
		
		
	}
	
	

}
