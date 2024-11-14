package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_AmazonApp {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("Laptop");
		Thread.sleep(3000);
		List<WebElement> w2 = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int length = w2.size();
		System.out.println(length);

		for (int i = 0; i < length; i++) {
			WebElement w3 = w2.get(i);
			System.out.println(w3.getText());
			
		}
		
		
		w2.get(2).click();

	}

}
