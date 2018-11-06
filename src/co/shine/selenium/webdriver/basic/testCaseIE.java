package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;

public class testCaseIE{

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\tools\\Selenium\\MicrosoftWebDriver.exe");
		System.out.println("teste");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
	}

}
