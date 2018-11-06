package co.shine.selenium.webdriver.basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class multipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[2]/a")).click();//abre em uma 2 página
		Thread.sleep(2000);
		System.out.println("Before Switching");
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parentid=it.next();
		String childid = it.next();
		Thread.sleep(2000);
		driver.switchTo().window(childid);
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(parentid);
		System.out.println("Switching Back to parent");
		System.out.println(driver.getTitle());
	}

}
