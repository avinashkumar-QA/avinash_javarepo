package failed_testcasestestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestCase_GoogleSearch extends Launch_Browser_Concept {

	@Test(retryAnalyzer = failed_testcasestestng.Retry_Analyser.class)
	public void searchGoogle() throws InterruptedException {

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("qq")).sendKeys("india");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

}
