package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.spicejet.com");
		//driver.manage().window().maximize();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("scroll(0,490)");
		Thread.sleep(2000);
		System.out.println("Before clicking on Multi city button: ");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//label[contains(text(),'Multicity')]")).click();
		Thread.sleep(2000);
		System.out.println("After clicking on Multi city button: ");
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isDisplayed());
		//System.out.println(driver.findElement(By.xpath(".//label[contains(text(),'Multicity')]")).isDisplayed());//exibido
		System.out.println("Value isEnabled:  "+driver.findElement(By.xpath(".//label[contains(text(),'Multicity')]")).isEnabled());//ativado
		int count = driver.findElements(By.xpath(".//label[contains(text(),'Multicity')]")).size();
		System.out.println("size: "+count);
		if (count==0){
			System.out.println("Verified ");
		}		

	}

}
