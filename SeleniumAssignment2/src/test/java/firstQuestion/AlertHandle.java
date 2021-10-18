package firstQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertHandle 

{
	@Test
   public void test1()
   {
	    String currentDir = System.getProperty("user.dir");
	
	    System.setProperty("webdriver.gecko.driver",currentDir+"\\Drivers\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();      //Creating an object of FirefoxDriver
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit. SECONDS);

		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("alertButton")));	
		driver.findElement(By.id("alertButton")).sendKeys(Keys.ENTER); // clicking on button to open Alert
		
		Alert alert = driver.switchTo().alert();
		//Try to Fetch the alert pop-up text.
		String alertText = alert.getText();
		System.out.println("**************************************");
		System.out.println(alertText);
		alert.accept();
		
		driver.close();  
   }
	
	
	@Test
	   public void test2()
	   {
		    String currentDir = System.getProperty("user.dir");
		
		    System.setProperty("webdriver.gecko.driver",currentDir+"\\Drivers\\geckodriver.exe"); 
			WebDriver driver = new FirefoxDriver();      //Creating an object of FirefoxDriver
			
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit. SECONDS);
			
			Actions actions=new Actions(driver);
			actions.moveToElement(driver.findElement(By.id("confirmButton")));	
			driver.findElement(By.id("confirmButton")).sendKeys(Keys.ENTER);; // clicking on button to open Alert
			
			Alert alert_Dismiss = driver.switchTo().alert();
			//Dismissing the Alert prompt
			alert_Dismiss.dismiss();
			
			driver.close();  
	   }
	
	@Test
	   public void test3()
	   {
		    String currentDir = System.getProperty("user.dir");
		
		    System.setProperty("webdriver.gecko.driver",currentDir+"\\Drivers\\geckodriver.exe"); 
			WebDriver driver = new FirefoxDriver();      //Creating an object of FirefoxDriver
			
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit. SECONDS);
			
			Actions actions=new Actions(driver);
			actions.moveToElement(driver.findElement(By.id("promtButton")));		
			driver.findElement(By.id("promtButton")).sendKeys(Keys.ENTER); // clicking on button to open Alert
			
			Alert alert_Prompt = driver.switchTo().alert();
			//sending some data to the Alert prompt
			alert_Prompt.sendKeys("Hello world");
			alert_Prompt.accept();
	
			driver.close();  
	   }
	
	@Test
	   public void test4()
	   {
		    String currentDir = System.getProperty("user.dir");
		
		    System.setProperty("webdriver.gecko.driver",currentDir+"\\Drivers\\geckodriver.exe"); 
			WebDriver driver = new FirefoxDriver();      //Creating an object of FirefoxDriver
			
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit. SECONDS);

			Actions actions=new Actions(driver);
			actions.moveToElement(driver.findElement(By.id("confirmButton")));	
			driver.findElement(By.id("confirmButton")).sendKeys(Keys.ENTER);; // clicking on button to open Alert
			
			Alert alert_Prompt = driver.switchTo().alert();
			//accepting the  Alert prompt
			alert_Prompt.accept();

			driver.close();  
	   }
}
