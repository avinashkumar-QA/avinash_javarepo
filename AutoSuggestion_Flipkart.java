package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Flipkart {
	
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.className("Pke_EE"));
		w1.sendKeys("shoe");
		Thread.sleep(3000);
		List<WebElement> w2 = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int length = w2.size();
		System.out.println(length);

		for (int i = 0; i < length; i++) {
			WebElement w3 = w2.get(i);
			System.out.println(w3.getText());
			
		}
		
		
		w2.get(1).click();

	}

}
