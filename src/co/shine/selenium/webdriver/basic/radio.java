package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,490)");
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		Thread.sleep(2000);
		System.out.println("Size of group: "+driver.findElements(By.xpath("//input[@name='group1']")).size());	
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0; i< count; i++){
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println("Value of group: "+text);
			//if(text.equals("Cheese"))
			if(text=="Cheese"){
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
			Thread.sleep(2000);
		}
		

	}

}
