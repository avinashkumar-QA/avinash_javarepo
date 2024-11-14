package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click_Flipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement w1 = driver.findElement(By.xpath("//span[.='Login']"));

		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.contextClick(w1).perform();
		
	}
}
