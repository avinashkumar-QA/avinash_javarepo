package amazon_search_dimensionalddt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_Search_DimensionalDDT extends Launch_browserFor_Amazon {
	
	
	@DataProvider(name="data1")
	public Object method1() {
		
		Object inputdata[][]= new Object[7][1];
		inputdata[0][0]= "computer";
		inputdata[1][0]= "shoe";
		inputdata[2][0]= "plant";
		inputdata[3][0]= "tiranga";
		inputdata[4][0]= "homedecor";
		inputdata[5][0]= "pendrive";
		inputdata[6][0]= "shocks";
		
		return inputdata;
		
	}
	
	@Test(dataProvider="data1")
	public void amazonSearchFeature(String inputdata) {
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys(inputdata + Keys.ENTER);
		Reporter.log(inputdata+" ".concat("searched successfully"));
		
	}

}
