package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		//driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,490)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(2000);
		String alert=driver.switchTo().alert().getText();
		//String testAlert=driver.switchTo().alert().sendKeys("Teste de mensagem");
		
		System.out.println("Conteudo da mensagem: "+alert);
		//System.out.println("Conteudo da mensagem: "+testAlert);
		driver.switchTo().alert().accept();//Clicar no botao Ok
		//driver.switchTo().alert().dismiss();//Qdo tem a opcao do botao cancelar
		
		///html[1]/body[1]/table[3]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[4]/form[1]/input[1]

	}

}
