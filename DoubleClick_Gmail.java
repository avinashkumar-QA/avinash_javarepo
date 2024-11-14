package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Gmail {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement w1 = driver.findElement(By.linkText("Gmail"));

		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.doubleClick(w1).perform(); 
		
	
	}
}
