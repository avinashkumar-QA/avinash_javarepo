package dataprovider_multipleinputs;

/* Write a program to search the multiple things
 * 
 * This can be done by using the annotation @DataProvider in testNG
 * 
 * In this we have suppose having one test case to 
 * test the login feature but our job is to check 
 * with multiple sets of valid and invalid input.
 * 
 * 1 testcase having 5 types of input i.e 1*5= 5
 * 
 * Steps:
 * 
 * 1. Inside the testcase with @Test annotation 
 * add paranthesis and enter the annotation dataProvider= "AnyString"
 * 
 * 
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Search_Google_with_Manyinputs extends Launching_browser_class {

	@DataProvider(name = "data1")
	public Object[][] method1() {

		return new Object[][] { { "Ram" }, { "Shyam" }, { "computer" }, { "Salmankhan" } };

	}

	@DataProvider(name = "data2")
	public Object[][] method2() {

		return new Object[][] { { "1" }, { "2" }, { "3" }, { "123" } };

	}

	@Test(dataProvider = "data2")
	public void Searh_Google(String input) {

		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys(input + Keys.ENTER);

	}

}
