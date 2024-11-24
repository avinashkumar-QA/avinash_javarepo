package testng_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/* Amazon Search */

public class TestCase2_AmazonSearch extends Launch_And_Quit_Browser {
	
	@Test
	public void amazon_Search() throws InterruptedException {
		
		System.out.println("Writing the script for Search ");
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Shoe" + Keys.ENTER);
		Thread.sleep(4000);
	}
	


}
