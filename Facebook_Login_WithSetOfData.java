package datadriven.dataproviderfacebook;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_Login_WithSetOfData extends Launch_Facebook {

	@DataProvider(name = "data1")
	public Object[][] method1() {

		Object input[][] = new Object[4][2];
		input[0][0] = "avinashkumar2113@gmail.com"; // valid UN, valid PWD
		input[0][1] = "avinash123@";

		input[1][0] = "avinashkumar2113@gmail.com"; // valid UN, Invalid PWD
		input[1][1] = "avinash123";

		input[2][0] = "avinashkumar21@gmail.com"; // Invalid UN, Invalid PWD
		input[2][1] = "avinash";

		input[3][0] = ""; // Null UN, Null PWD
		input[3][1] = "";

		return input;
	}

	@Test(dataProvider = "data1")
	public void loginFacebook(String username, String password) throws InterruptedException {

		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		Thread.sleep(3000);

		// driver.findElement(By.name("login")).click();

	}

}
