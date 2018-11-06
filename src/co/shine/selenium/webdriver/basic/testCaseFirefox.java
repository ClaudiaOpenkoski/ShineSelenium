package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//geckodriver ->firefox driver

public class testCaseFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\tools\\Selenium\\geckodriver-v0.21.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
