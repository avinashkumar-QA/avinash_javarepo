package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_GroTechMinds {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement w1 = driver.findElement(By.xpath("//img[@id='drag7']"));
		WebElement w2 = driver.findElement(By.xpath("//div[@id='div2']"));
		

		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.dragAndDrop(w1, w2).perform(); // Drag and Drop
		
		WebElement w3 = driver.findElement(By.id("drag7"));
		WebElement w4 = driver.findElement(By.xpath("//div[@id='container-6']"));
		Thread.sleep(2000);
		a1.dragAndDrop(w3, w4).perform();
		

	}
}
