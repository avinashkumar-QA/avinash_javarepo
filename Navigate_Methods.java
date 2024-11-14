package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys("GroTechMinds");
		w1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
	}

}
