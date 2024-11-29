package testng_crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_1_Amazon extends Launch_Browser {

	@Test
	public void Amazon() throws InterruptedException {
		System.out.println("Amazon: Writing the script only for Search");
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Shoe" + Keys.ENTER);
		Thread.sleep(4000);

	}
}
