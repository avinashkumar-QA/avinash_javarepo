package amazon_login_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_Amazon_Login_1 extends AmazonLogin_BrowserLaunch1 {

	@DataProvider(name = "data1")
	public Object[][] method() {

		Object inputDetails[][] = new Object[4][2];

		inputDetails[0][0] = "avinashsingh2102@gmail.com"; // valid UN & Valid PWD
		inputDetails[0][1] = "avinash@123";

		inputDetails[1][0] = "avinashsingh2102@gmail.com"; // valid UN & inValid PWD
		inputDetails[1][1] = "avinash@12";

		inputDetails[2][0] = "avinashsingh2@gmail.com"; // Invalid UN & inValid PWD
		inputDetails[2][1] = "avinash@";

		inputDetails[3][0] = "avinash@gmail.com"; // Invalid UN & Valid PWD
		inputDetails[3][1] = "avinash@123";

		return inputDetails;
	}

	@Test(dataProvider = "data1")
	public void login1(String UN, String PWD) {

		WebElement e1 = driver.findElement(By.id("ap_email"));
		e1.sendKeys(UN + Keys.ENTER);

		WebElement e2 = driver.findElement(By.id("ap_password"));
		e2.sendKeys(PWD + Keys.ENTER);

	}

}
