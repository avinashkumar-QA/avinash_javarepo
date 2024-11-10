package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("avinashkumar2113@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345@abc");
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();
	}

}
