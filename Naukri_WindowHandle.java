package seleniumjava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch the Naukri.com
//Click on the Sign-in button
//Capture the windows id of parent and child seperately by iterator
//switch the window parent to child and pass the some value in textfield
//close the controlled window.

public class Naukri_WindowHandle {
	
	public static void main(String[] args) throws InterruptedException{
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		
		WebElement e1= driver.findElement(By.xpath("//span[.='Google']"));
		e1.click();
		
		Set <String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
			String parentWindow= i1.next();
			String childWindow= i1.next();
			System.out.println(parentWindow);
			System.out.println(childWindow);
			
			driver.switchTo().window(childWindow);
			WebElement e2= driver.findElement(By.xpath("//input[@aria-label='Email or phone']"));
			
			e2.sendKeys("avinashkumar2113@gmail.com");
			
			Thread.sleep(2000);
			driver.close();
		
		
		
	}

}
