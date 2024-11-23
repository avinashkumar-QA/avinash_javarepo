package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsam_IsDisabledField {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SONY/Desktop/grotechminds.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.xpath("//input[@name='lname']"));
		boolean b1 = w1.isDisplayed();
		boolean b2 = w1.isEnabled();

		if (b1 == true && b2 == true) {

			System.out.println("You can perform an action");
			w1.sendKeys("Ram");
		}

		else {

			System.out.println("You can't perform an action");
		}
		
		Thread.sleep(2000);
		WebElement w2 = driver.findElement(By.xpath("//input[@name='name1']"));
		System.out.println(w2.isDisplayed());
		System.out.println(w2.isEnabled());
		w2.click();
		System.out.println(w2.isSelected());
	
		}

	}

