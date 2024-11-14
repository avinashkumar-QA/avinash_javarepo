package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_GroTechMind_Registration {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.name("Skills"));

		Select s1 = new Select(w1);
		s1.selectByVisibleText("Non-Technical Skills");
		
		WebElement w2 = driver.findElement(By.name("Country"));
		Select s2 = new Select(w2);
		s2.selectByValue("Bhutan");
		
		WebElement w3 = driver.findElement(By.name("Relegion"));
		Select s3 = new Select(w3);
		s3.selectByValue("Hindu");
		
		//Second way to handle the drop-down without select class//.
		//w3.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		

	}
}