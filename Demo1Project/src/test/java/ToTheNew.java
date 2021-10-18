import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToTheNew 

{
	@Test
	public void TestToTheNew()
	{
		String currentDir = System.getProperty("user.dir");
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", currentDir+"\\Drivers\\new\\chromedriver.exe");  
        
        
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://www.tothenew.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
		
		//With the Help of Xpath
		
//		WebElement contactUsWebElement = driver.findElement(By.xpath("(//a[@id='h-contact-us'])[2]"));
//		Actions actions=new Actions(driver);
//        actions.moveToElement(contactUsWebElement);
//        contactUsWebElement.sendKeys(Keys.ENTER);
        
      //With the Help of ID
        
		List<WebElement> contactUs=driver.findElements(By.id("h-contact-us"));
        Actions actions=new Actions(driver);
        actions.moveToElement(contactUs.get(1));
        contactUs.get(1).sendKeys(Keys.ENTER);
		
	
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
		
		String Tittle = driver.getTitle();
		System.out.println("Tittle of Page is "+Tittle);
		
		String urlName = driver.getCurrentUrl();
		System.out.println("URL of Page is "+urlName);
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
		// Close browser
				driver.close();
		
		
	}

}
