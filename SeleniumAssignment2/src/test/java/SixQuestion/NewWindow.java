package SixQuestion;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindow 
{
	@Test
	public void handleMultipleWindow()
	{
	String currentDir = System.getProperty("user.dir");
	// System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", currentDir+"\\Drivers\\new\\chromedriver.exe");   	// System Property for Chrome Driver
    WebDriver driver=new ChromeDriver();  		// Initialize Chrome browser
    
	 
    driver.get("https://demoqa.com/browser-windows");
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(25, TimeUnit. SECONDS);

    // Open new child window within the main window
    driver.findElement(By.id("windowButton")).click();

    //Get handles of the windows
    String mainWindowHandle = driver.getWindowHandle();
    
    Set<String> allWindowHandles = driver.getWindowHandles();
    Iterator<String> iterator = allWindowHandles.iterator();

    // Here we will check if child window has other child windows and will fetch the heading of the child window
    while (iterator.hasNext()) 
    {
        String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) 
            {
            driver.switchTo().window(ChildWindow);
            
            // print the title and text in the newly opened window,
            System.out.println("Tittle of the New window is: "+driver.getTitle());
            System.out.println("Text inside New window is: "+driver.findElement(By.id("sampleHeading")).getText());   
        }
	}
    
    //then switch back to main window.
    driver.switchTo().window(mainWindowHandle);
    
    driver.quit();
	}
}
