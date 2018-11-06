package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class schoolTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8088/#/");
		Thread.sleep(2000);
		//Sign in
		driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Sign in')]")).click();		
		Thread.sleep(2000);
		//Menu - Entities
		driver.findElement(By.xpath("//span[contains(text(),'Entities')]")).click();
		//Menu - category 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@jhitranslate='global.menu.entities.category']//span[contains(text(),'Category')]")).click();
		Thread.sleep(2000);

		//New category - Cancel
		driver.findElement(By.xpath("//span[contains(text(),'Create a new Category')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("field_name")).sendKeys("LifeStyle 123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);
		
		//New category- Save
		driver.findElement(By.xpath("//span[contains(text(),'Create a new Category')]")).click();
		driver.findElement(By.id("field_name")).sendKeys("TV Show");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		
		//New category- Save
		driver.findElement(By.xpath("//span[contains(text(),'Create a new Category')]")).click();
		driver.findElement(By.id("field_name")).sendKeys("Bakery");
		driver.findElement(By.id("field_name")).sendKeys("Photography");
		driver.findElement(By.id("field_name")).sendKeys("Garden");
		driver.findElement(By.id("field_name")).sendKeys("Photography");
		driver.findElement(By.id("field_name")).sendKeys("Music");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		Thread.sleep(2000);

		//View / Edit / Alter 
		driver.findElement(By.xpath("//tbody//tr[16]//td[3]//div[1]//button[1]//span[2]//span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='field_name']")).clear();
		driver.findElement(By.xpath("//input[@id='field_name']")).sendKeys(" No last text - Work now");
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Back')]")).click();
		Thread.sleep(2000);		

		
		//Edit - Alter
		driver.findElement(By.xpath("//tbody//tr[13]//td[3]//div[1]//button[2]//span[2]//span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("field_name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("field_name")).sendKeys("No Music - Movies now");
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		Thread.sleep(2000);


		//Pagination Next to Last
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'»')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'»')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'»')]")).click();
	
		//Pagination return only 1
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//span[contains(text(),'«')]")).click();
		Thread.sleep(2000);
		
		//Delete item
	    driver.findElement(By.xpath("//tbody//tr[20]//td[3]//div[1]//button[3]//span[2]//span[1]")).click();
	    driver.findElement(By.xpath("//div[@class='modal-footer']//span[contains(text(),'Delete')]")).click();	    
	    Thread.sleep(2000);

		//Sign out
		
		driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign out')]")).click();
		Thread.sleep(2000);
		
		//Close
		driver.close();
	}

}
