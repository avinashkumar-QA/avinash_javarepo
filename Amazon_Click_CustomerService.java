package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Click_CustomerService {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		WebElement w1 = driver.findElement(By.partialLinkText("Customer Service"));
		w1.click();
//		WebElement w2= driver.findElement(By.partialLinkText("Customer"));
//		w2.click();

	}

}
