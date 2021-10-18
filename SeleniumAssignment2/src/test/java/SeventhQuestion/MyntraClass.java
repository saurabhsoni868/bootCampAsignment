package SeventhQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyntraClass
{
	
@Test
public void clockUrl()
{
	String currentDir = System.getProperty("user.dir");
	// System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", currentDir+"\\Drivers\\new\\chromedriver.exe");   	// System Property for Chrome Driver
    WebDriver driver=new ChromeDriver();  		// Initialize Chrome browser
    
	 
	// Open Google
	driver.get(" https://www.myntra.com/");
    driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(25, TimeUnit. SECONDS);
	
	//Mouse hover on the Home & Living tab
	WebElement ele = driver.findElement(By.xpath("//a[@data-group='home-&-living']"));
	//Creating object of an Actions class
	Actions action = new Actions(driver);
	//Performing the mouse hover action on the target element.
	action.moveToElement(ele).perform();
	
	
	// then click clock
	driver.findElement(By.linkText("Clocks")).click();
	
	//now validate that navigated URL is for clock section.
	String clockURL = driver.getCurrentUrl();
	Assert.assertEquals(clockURL, "https://www.myntra.com/clocks");
	
	
	driver.close();
	
}


}
