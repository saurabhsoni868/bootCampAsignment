package QuestionThree;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waits 
{
	@Test
	public void testMethod()
	{
		String currentDir = System.getProperty("user.dir");
		// System Property for Chrome Driver   
	    System.setProperty("webdriver.chrome.driver", currentDir+"\\Drivers\\new\\chromedriver.exe");   	// System Property for Chrome Driver
	    WebDriver driver=new ChromeDriver();  		// Initialize Chrome browser
	    
		 
	    
		// Open Google
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
		
		//Register new email
		String email = RandomStringFactory.usingUUID()+"@gmail.com"; 
		driver.findElement(By.id("email_create")).sendKeys(email);
		driver.findElement(By.id("SubmitCreate")).click();
		
		// wait till the Registration page is not opend
		 WebDriverWait wait = new WebDriverWait(driver, 15);      	
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Your personal information']")));
		 driver.findElement(By.name("customer_firstname")).sendKeys("Demo Name");
		 driver.close();
		
	}

}
