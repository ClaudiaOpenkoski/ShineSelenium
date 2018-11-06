package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForce {

	public salesForce() {
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click();// class name - nao pode ter espacos
		//driver.findElement(By.xpath("//*[@id='username']")).click();
		//driver.findElement(By.xpath("//*[@id='password']"))
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		//forgot Password
		
		//$x("//*[@id='forgot_password_link']")
	}
	

}
