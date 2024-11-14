package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Computer");
		Thread.sleep(3000);

		List<WebElement> e2 = driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));

		int length = e2.size();
		System.out.println(length);

		for (int i = 0; i < length; i++) {
			WebElement a1 = e2.get(i);
			System.out.println(a1.getText());
		}
		
		e2.get(1).click();	
		
	}

}
