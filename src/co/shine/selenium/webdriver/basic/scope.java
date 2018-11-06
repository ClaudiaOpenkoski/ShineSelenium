package co.shine.selenium.webdriver.basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//String titulo = driver.getTitle();
		//System.out.println("Listando titulo página: "+titulo);
		//System.out.println(driver.findElements(By.tagName("iframe"));
		//1. Give me the count of links on the page.
		//a
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));//limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		Thread.sleep(2000);
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		Thread.sleep(2000);
		//4 - click on each link in the column and check if the page are opening
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++){
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(2000);
		   }
		    //open all the tabs
			Set<String> abc=driver.getWindowHandles();
			Iterator<String>it=abc.iterator();
			Thread.sleep(2000);
			while(it.hasNext())// hasNext = Se o proximo index existe
			{
				driver.switchTo().window(it.next());
				//Imprime o titulo das paginas
				System.out.println(driver.getTitle());
			}	

	}

}
