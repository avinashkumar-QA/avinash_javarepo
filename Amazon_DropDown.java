package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_DropDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("searchDropdownBox"));

		// Select s1= new Select(w1);
		// s1.selectByIndex(4); //This will work as per indexing
		// s1.selectByValue("search-alias=fashion"); //By value we can also select.
		// s1.selectByVisibleText("Appliances"); // By visibleText also we can select.

		// Without using select class//

		w1.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);

	}

}
