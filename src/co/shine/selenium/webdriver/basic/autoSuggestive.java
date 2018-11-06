package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();       
        driver.get("https://www.ksrtc.in/");
        Thread.sleep(2000);
        driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
        Thread.sleep(2000);
        //driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
        //driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
        System.out.println(driver.findElement(By.id("fromPlaceName")).getText());


	//Javascript DOM can extract hidden elements
	//because selenium cannot identify hidden elements - (Ajax implementation)
	//investigate the properties of object if it have any hidden text

	//JavascriptExecutor
	JavascriptExecutor js= (JavascriptExecutor)driver;

	String script = "return document.getElementById(\"fromPlaceName\").value;";
	String text=(String) js.executeScript(script);
	System.out.println(text);
	int i =0;
	//BENGALURU INTERNATION AIPORT
	while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT"))
	{
	i++;
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).click();

	text=(String) js.executeScript(script);
	System.out.println(text);
	if(i>10)
	{
	break;
	}

	}

	if(i>10)
	{
	System.out.println("Element not found");
	}
	else
	{
	System.out.println("Element  found");
	}

	}

	}
