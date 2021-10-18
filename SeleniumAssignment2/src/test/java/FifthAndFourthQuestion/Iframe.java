package FifthAndFourthQuestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Iframe 
{
	
@Test
public void testMethod() 
{
	String currentDir = System.getProperty("user.dir");
	// System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", currentDir+"\\Drivers\\new\\chromedriver.exe");   	// System Property for Chrome Driver
    WebDriver driver=new ChromeDriver();  		// Initialize Chrome browser
    
	 
	// Open Google
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(25, TimeUnit. SECONDS);
	
	//Print the count of frames on this application.
	List<WebElement> numbersOfIFrame = driver.findElements(By.xpath("//iframe[@src='SingleFrame.html']"));
	System.out.println("The Count of numbers of Iframes are: "+ (numbersOfIFrame.size()+1));
	
	
	driver.switchTo().frame(driver.findElement(By.id("singleframe")));
	driver.findElement(By.tagName("input")).sendKeys("Entring into Single-Iframe");
	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	
	//Print and switch to inner iframe
	System.out.println(driver.switchTo().frame(1));

	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Entring into Iframe inside Iframe");
	driver.close();
}


}
