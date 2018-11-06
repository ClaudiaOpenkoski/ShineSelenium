package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class rediff {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		
	}

}
