import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleDemo 
{
	
	@Test
	public void  TestForGoogle() throws InterruptedException
	{
		
		String currentDir = System.getProperty("user.dir");
		
		
//		System.setProperty("webdriver.gecko.driver",currentDir+"\\Drivers\\geckodriver.exe"); // Setting system properties of FirefoxDriver
//		WebDriver driver = new FirefoxDriver();        //Creating an object of FirefoxDriver
//		
		

		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", currentDir+"\\Drivers\\new\\chromedriver.exe");   	// System Property for Chrome Driver
        WebDriver driver=new ChromeDriver();  		// Initialize Chrome browser
        

        

		 
		// Open Google
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("To The New");
		
		
		
		 
		// Close browser
		driver.close();
		
	}

}
