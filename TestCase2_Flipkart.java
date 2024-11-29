package testng_crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2_Flipkart extends Launch_Browser {

	@Test
	public void Flipkart() throws InterruptedException {
		System.out.println("Flipkart: Writing the script only for Search");

		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.className("Pke_EE"));
		w1.sendKeys("shoe");
		Thread.sleep(3000);
	

	}
}
