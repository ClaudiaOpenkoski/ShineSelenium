package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class miscellaneous {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://socialblade.com/register");
        Thread.sleep(2000);
        int number = findFramenumber(driver, By.xpath(".//*[@id='recaptcha-anchor-label']"));//Checkbox p marcar nao sou robo
        driver.switchTo().frame(number);
        System.out.println(number);
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='recaptcha-anchor-label']")).click();
        driver.switchTo().defaultContent();
        
        int number1 = findFramenumber(driver,By.xpath("//*[@id='recaptcha-verify-button']"));
        driver.switchTo().frame(number1);
        System.out.println(number1);
        driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();//Botao que verifica a imagem
      //input[@value='Register']
   
} 
public static int findFramenumber(WebDriver driver, By by)
{
int i;
int framecount = driver.findElements(By.tagName("iframe")).size(); 
for(i=0; i<framecount; i++)
{
driver.switchTo().frame(i);
int count = driver.findElements(by).size();
if(count>0)
{
break;
}
else
{
System.out.println("Continue to Loop");
}
}
driver.switchTo().defaultContent();
return i; 
}

}