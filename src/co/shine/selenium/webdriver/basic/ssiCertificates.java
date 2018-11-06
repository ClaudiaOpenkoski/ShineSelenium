package co.shine.selenium.webdriver.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ssiCertificates {

	public static void main(String[] args) {

		//SSl certificates

		//Desired capabilities=
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Belows to your local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);// O QUE FAZ O MERGE?
		System.setProperty("webdriver.chrome.driver", "");
		//System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver(c);


		}

		}
