package amazon_search_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonSearch_DataProvider extends Launch_Amazon {

	@DataProvider(name = "data1")
	public Object method1() {

		return new Object[][] { { "shoe" }, { "computer" }, { "harddisk" }, { "ram" } };
	}

	@Test(dataProvider = "data1")
	public void amazonSearch(String input) throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys(input + Keys.ENTER);
		Reporter.log(input+" ".concat("searched successfully"));
	}

}
