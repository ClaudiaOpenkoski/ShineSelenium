package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("My own xPath");
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Hello");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//driver.findElement(By.cssSelector("#email")).sendKeys("My Own Css");//Outra  forma de usar o css do email
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("MyOwnCss");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
	}



}
