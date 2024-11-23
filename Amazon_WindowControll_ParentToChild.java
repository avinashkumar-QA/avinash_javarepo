package seleniumjava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_WindowControll_ParentToChild {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("shoe");
		Thread.sleep(2000);
		WebElement e2=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		e2.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement e3= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		e3.click();
		Set <String> s1=driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator<String> i1= s1.iterator();
		String parentId= i1.next();
		String childId=	i1.next();
		System.out.println(parentId);
		System.out.println(childId);
		driver.switchTo().window(childId);
		WebElement w2= driver.findElement(By.id("add-to-cart-button"));
		w2.click();
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		driver.close();
		}
	}


