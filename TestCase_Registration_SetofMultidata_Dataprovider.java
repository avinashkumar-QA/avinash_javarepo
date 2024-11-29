package growtechmind_registration_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_Registration_SetofMultidata_Dataprovider extends Launch_Registation_GroTechminds {

	@DataProvider(name = "data1")
	public Object method() {

		Object regis_inputdata[][] = new Object[3][7];
		regis_inputdata[0][0] = "Avinash";  
		regis_inputdata[0][1] = "Kumar";
		regis_inputdata[0][2] = "avinashkumar2113@gmail.com";
		regis_inputdata[0][3] = "avinash@123";
		regis_inputdata[0][4] = "Chhoti Madai, Hajipur";
		regis_inputdata[0][5] = "Chakmakrand Halt";
		regis_inputdata[0][6] = "844101";
		
		regis_inputdata[1][0] = "pooja";  
		regis_inputdata[1][1] = "Kumari";
		regis_inputdata[1][2] = "pooja@gmail.com";
		regis_inputdata[1][3] = "";
		regis_inputdata[1][4] = "Bakhtiyarpur";
		regis_inputdata[1][5] = "Bakhtiyarpur station";
		regis_inputdata[1][6] = "380052";
		
		regis_inputdata[2][0] = "Amit";  
		regis_inputdata[2][1] = "Singh";
		regis_inputdata[2][2] = "";
		regis_inputdata[2][3] = "amit@123";
		regis_inputdata[2][4] = "patna";
		regis_inputdata[2][5] = "patna";
		regis_inputdata[2][6] = "800023";

		return regis_inputdata;
	}

	@Test(dataProvider="data1")
	public void growtechRegis(String fname, String lname, String email, String pwd, String presentadd, String permaadd, String pincode) {

		WebElement e1 = driver.findElement(By.id("fname"));
		e1.sendKeys(fname);
		WebElement e2 = driver.findElement(By.id("lname"));
		e2.sendKeys(lname);
		WebElement e3 = driver.findElement(By.id("email"));
		e3.sendKeys(email);
		WebElement e4 = driver.findElement(By.id("password"));
		e4.sendKeys(pwd);
		WebElement e5 = driver.findElement(By.id("Present-Address"));
		e5.sendKeys(presentadd);
		WebElement e6 = driver.findElement(By.id("Permanent-Address"));
		e6.sendKeys(permaadd);
		WebElement e7 = driver.findElement(By.id("Pincode"));
		e7.sendKeys(pincode);
		WebElement e8 = driver.findElement(By.xpath("(//div//button)[2]"));
		e7.sendKeys(Keys.ENTER);
		
	}

}
