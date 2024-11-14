package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement w1 = driver.findElement(By.xpath("//div//input[@id='twotabsearchtextbox']"));
		Thread.sleep(3000);
		w1.sendKeys("Computer");
		
		
	}

}
