package testng_amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/* Amazon Search the product/Add to cart / Logout*/

public class TestCase1_AmazonSearch_Add_toCart extends Launch_And_Quit_Browser{
	
	@Test
	public void amazon_Search_addCart() throws InterruptedException {
		
		System.out.println("Writing the script for Seach and Add Cart");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Shoe" + Keys.ENTER);
		Thread.sleep(2000);
		WebElement e2= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		e2.click();
		Set <String> gwids=driver.getWindowHandles();
		System.out.println(gwids);
		Iterator  <String> i1=gwids.iterator();
		String parentId1= i1.next();
		String childId1= i1.next();
		System.out.println(parentId1);
		System.out.println(childId1);
		Thread.sleep(3000);
		driver.switchTo().window(childId1);
		WebElement e3= driver.findElement(By.id("add-to-cart-button"));
		e3.click();
		driver.close();
		driver.switchTo().window(parentId1);
		
		
	}
	
	


}
