package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_GroTechMind{

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/dropdown/");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.name("Choice1"));

		Select s1 = new Select(w1);
		s1.selectByValue("Demo4");

		WebElement w2 = driver.findElement(By.name("Choice2"));

//		Select s2= new Select(w2);
//		s2.selectByValue("practice15");

		w2.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);

	}

}
