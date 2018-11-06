package co.shine.selenium.webdriver.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1 {
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser(){
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				
			//driver.get("https://www.edureka.co");
			driver.get("http://www.propertybazaar.com");
			
			//searchCourse();
			dropDownRealState();
			//property();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void dropDownRealState() throws InterruptedException{	

		//Field Residencial
		Select objSelectApartment = new Select(driver.findElement(By.id("dropsearchpropertytype")));
		objSelectApartment.selectByVisibleText("Residential Apartment");//Seleciona um item na combobox Apartament
		Thread.sleep(2000); 
		
		//Field City
		Select objSelectCity = new Select(driver.findElement(By.id("dropstates2")));
		objSelectCity.selectByVisibleText("Noida");//Seleciona um item na combobox Cidade
		Thread.sleep(2000);
		
		//Field Budget
		Select objSelectBudget = new Select(driver.findElement(By.id("SelectBudgetForProperty")));
		objSelectBudget.selectByVisibleText("50 to 55 Crores");
		Thread.sleep(2000);
		
		//Field Residencial
		objSelectApartment.selectByVisibleText("All Residential");
		Thread.sleep(3000);
		
		//Field Buy or Rent
		driver.findElement(By.xpath("//label[@for='2']")).click();//Troca o check do radio
		Thread.sleep(2500);
		
		//Checkbox Result By
		List allCheckBoxList = driver.findElements(By.className("jqTransformCheckbox"));

		int chkboxlistsize = allCheckBoxList.size();
		String chkboxeachvalue = ((WebElement)allCheckBoxList.get(0)).getAttribute("value");
		
		for(int i = 0; i < chkboxlistsize; i++) 
		{
			((WebElement) allCheckBoxList.get(i)).click();//Desmarca todos os checkbox da pagina
		}	
		Thread.sleep(8000);
		
		//Button Search
		driver.findElement(By.className("searchButton")).click();
		Thread.sleep(2500);
		
		//Field Refine By
		Select objSelectRefine = new Select(driver.findElement(By.id("transctype")));
		objSelectRefine.selectByVisibleText("New");		
		Thread.sleep(2500);
		
	    driver.findElement(By.id("checkindividual")).click();
	    Thread.sleep(2000);
/*
		//Field Advertise By
		List allCheckBoxListAdv = driver.findElements(By.id("normaltext"));

		int chkboxlistsizeAdv = allCheckBoxListAdv.size();
		String chkboxeachvalueAdv = ((WebElement)allCheckBoxListAdv.get(0)).getAttribute("value");
		
		for(int i = 0; i < chkboxlistsizeAdv; i++) 
		{
			((WebElement) allCheckBoxListAdv.get(i)).click();//Desmarca todos os checkbox da pagina
		}	
		Thread.sleep(8000);
*/
		//Field Photo
		Select objSelectPhoto = new Select(driver.findElement(By.id("searchwithphoto")));
		objSelectPhoto.selectByVisibleText("With Picture");
		Thread.sleep(2000);
		
		//Field Carpet Area
		Select objSelectCarpet = new Select(driver.findElement(By.id("carpertarea")));
		objSelectCarpet.selectByVisibleText("0 to 500");
		Thread.sleep(2000);
		
		//Field Builtup Area 
		Select objSelectBuiltup = new Select(driver.findElement(By.id("builtuparea")));
		objSelectBuiltup.selectByVisibleText("500 to 1000");
		Thread.sleep(2000);
		
		//Field Plot Size  
		Select objSelectPlot = new Select(driver.findElement(By.id("plotsize")));
		objSelectPlot.selectByVisibleText("1000 to 2000");
		Thread.sleep(2000);
		
		//Field Bedroom
		Select objSelectBedroom = new Select(driver.findElement(By.id("probedroom")));
		objSelectBedroom.selectByVisibleText("3");
		Thread.sleep(2000);
		
		//Field Washroom
		Select objSelectWashroom = new Select(driver.findElement(By.id("probathroom")));
		objSelectWashroom.selectByVisibleText("2");
		Thread.sleep(2000);
		
		//Age of Property
		Select objSelectAge = new Select(driver.findElement(By.id("proage")));
		objSelectAge.selectByVisibleText("5-10 Years");
		Thread.sleep(2000);
		
		//Ownership Type
		Select objSelectOwnership = new Select(driver.findElement(By.id("proownership")));
		objSelectOwnership.selectByVisibleText("Freehold");
		Thread.sleep(2000);
		
		//Price Range
		Select objSelectPrice = new Select(driver.findElement(By.id("droprentpermonth")));
		objSelectPrice.selectByVisibleText("6,000 to 10,000");
		Thread.sleep(4000);
		driver.quit();
		driver.close();//Fecha janela
	
	}
	
	public void searchCourse(){
		try {
			driver.findElement(By.id("homeSearchBar")).sendKeys("Java");
			Thread.sleep(8000);
			driver.findElement(By.id("homeSearchBarIcon")).click();
			Select objSelectBatch = new Select(driver.findElement(By.xpath("//html/body/div[3]/div[4]/section/article/div[2]/div[1]/div[2]/div/div[2]/div/button")));
			objSelectBatch.selectByVisibleText("Weekend");
			
			Thread.sleep(20000);
			//driver.findElement(By.id("asdescription")).click();
			//driver.findElement(By.id("Weekend")).click();
			System.out.println("Weekend");
		    //driver.findElement(By.xpath("//*[@id='Weekend']")).click();
		    //driver.findElement(By.xpath("//*[contains(text(),'Batch Type')")).click();
			//jse = (JavascriptExecutor)driver;
			//jse.executeScript("scroll(0,400)");//Rola a pagina para baixo
			

//			Select mnt = new Select(driver.findElement(By.id("multiselect-selected-text")));	
//			mnt.selectByValue("Weekend");
			
			//WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Batch Type')]"));
			//System.out.println(element);
			//element.click();
			Thread.sleep(2000);


			//driver.findElement(By.xpath("//label[contains(text(),'Weekend')]")).click();
	
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void property() throws InterruptedException{
		//Field City
		Select objSelectCity = new Select(driver.findElement(By.id("dropstates2")));
		objSelectCity.selectByVisibleText("Noida");//Seleciona um item na combobox Cidade
		Thread.sleep(2000);
		
		System.out.println("List Your Property");
	    driver.findElement(By.partialLinkText("List")).click();
	    Thread.sleep(2000);
	    

	}
	
	public static void main(String[] args) {
		
		Day1 myObj = new Day1();
		myObj.invokeBrowser();

	}

}
