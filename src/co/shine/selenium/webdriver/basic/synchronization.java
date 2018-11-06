package co.shine.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='check gcw-packages-partial-stay']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='package-origin-hp-package']")).sendKeys("nyc");
		driver.findElement(By.xpath("//*[@id='package-origin-hp-package']")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.id("package-departing-hp-package")).sendKeys(Keys.TAB);
		driver.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.ENTER);
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until( ExpectedConditions.elementToBeClickable(By.id("package-checkin-wrapper-hp-package")));
		driver.findElement(By.id("package-checkout-wrapper-hp-package")).sendKeys(Keys.ENTER);
		

	}

}
