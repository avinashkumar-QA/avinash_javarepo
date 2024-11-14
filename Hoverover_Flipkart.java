package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement w1=driver.findElement(By.xpath("//span[.='Login']"));
		
		Actions a1= new Actions(driver);
		Thread.sleep(2000);
		a1.moveToElement(w1).perform(); //hoverover
		Thread.sleep(3000);
		
		WebElement w2=driver.findElement(By.xpath("//span[.='Fashion']"));
		Thread.sleep(2000);
		a1.moveToElement(w2).perform(); //hoverover
		Thread.sleep(3000);
		
		WebElement w3=driver.findElement(By.linkText("Men Footwear"));
		Thread.sleep(2000);
		a1.moveToElement(w3).perform(); //hoverover
		Thread.sleep(3000);
		
		WebElement w4=driver.findElement(By.linkText("Men's Sports Shoes"));
		w4.click();
		
		
		
		
	}

}
