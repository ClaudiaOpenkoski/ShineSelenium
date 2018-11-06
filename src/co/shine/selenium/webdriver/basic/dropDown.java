package co.shine.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://spicejet.com/");
		Thread.sleep(2000);

		  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		  Thread.sleep(2000);
		  //String Origin ="AMD";
		  String Origin ="GOI";
		  driver.findElement(By.xpath("//a[@value='"+Origin+"']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		  Thread.sleep(4000);
		  //String dest ="Hyd"; //Hyderabad (HYD)
		  String dest ="CCJ"; //Kozhikode (CCJ)
		  driver.findElement(By.xpath("(//a[contains(text(),'"+dest+"')])[2]")).click();		
			Select objSelectCurrency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			objSelectCurrency.selectByValue("AED");
			Thread.sleep(2000);
			objSelectCurrency.selectByIndex(3);
			Thread.sleep(2000);
			objSelectCurrency.selectByVisibleText("USD");
			driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
			Thread.sleep(2000);
			//Validate if checkbox is selected.
			driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected();
			System.out.println("isSelected: "+driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
			Thread.sleep(2000);

		//NAO FUNCIONOU
		//Select objSelectFrom = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		//objSelectFrom.selectByValue("GOI");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@value='GOI']")).click();

		/*driver.findElement(By.cssSelector("a[title='Flights']>span:nth-child(2)")).click();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, 3500);
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		dropdown.sendKeys("Goa (GOI)");
		Thread.sleep(3600);
		WebDriverWait wait2 = new WebDriverWait(driver, 3600);
		//WebElement dropdown2 = wait2.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")));
		//dropdown2.sendKeys("Adampur (AIP)");
		Thread.sleep(2000); 
 */

	}

}
