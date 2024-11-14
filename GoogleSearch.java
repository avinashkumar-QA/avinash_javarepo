package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("india");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
