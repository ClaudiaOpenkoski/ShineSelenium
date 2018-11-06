package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testCaseChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		driver.get("http://facebook.com");
		//driver.findElement(By.className("inputtext")).sendKeys("hellow");//Qdo o campo tem o mesmo nome, será aplicado o valor no primeiro campo encontrado
		//System.out.println(driver.getTitle());
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		//driver.findElement(By.name("pass")).sendKeys("123456");
		//driver.findElement(By.id("u_0_3"));
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	
		
		//System.out.println(driver.getCurrentUrl());//Validade if your page title is correct
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		
		//driver.close();//Closes current browser
		//driver.quit();//Closes all the browser opened in selenium script
	}

}
