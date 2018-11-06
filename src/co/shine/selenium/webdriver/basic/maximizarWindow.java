package co.shine.selenium.webdriver.basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.apache.commons.io.FileUtils;

public class maximizarWindow {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();       
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
	//	driver.manage().deleteCookieNamed("sessionKey");
	
	//click on any link
		//login page- verify login url

		WindowsUtils.killByName("excell.exe");// Fecha o excell
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(src,new File("C:\\Users\\usuario\\Downloads\\Claudia\\screenshot.png"));	
	
}

}
