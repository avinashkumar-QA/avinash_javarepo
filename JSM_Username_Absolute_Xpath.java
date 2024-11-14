package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSM_Username_Absolute_Xpath {
	
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/SONY/Desktop/grotechminds.html");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.xpath("(/html/body/input)[1]"));
		w1.sendKeys("Ram Ji");
	}

}
