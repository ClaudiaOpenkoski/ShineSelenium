package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("fewrew");//#username   "input[id='username']"
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("gfdd");
		driver.findElement(By.xpath("//*[@id='Login']")).click();

	}

}
