package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());//mostra o numero de frames
		driver.switchTo().frame(0);//escolhe o frame 0
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));//Somente executar esse comando qdo nao mostrar o numero do frame
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Thread.sleep(2000);
		System.out.println("Before Switching");
		//driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		//Switch back to page content.
		driver.switchTo().defaultContent();//?????
		//switch to frame2
		//driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//input[@value='Boat']")).click();
		System.out.println("Finishing Switching");
	}

}
