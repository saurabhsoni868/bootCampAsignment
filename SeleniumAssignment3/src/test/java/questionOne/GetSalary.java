package questionOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetSalary 

{
/**	Q1- https://www.ultimateqa.com/simple-html-elements-for-automation/
		Fetch Quality Assurance Engineer Salary from the table under HTML Table with no id.
		The code should be dynamic.
		*/
	@Test
	public void testMethod()
	{
	String currentDir = System.getProperty("user.dir");
	// System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", currentDir+"\\Drivers\\new\\chromedriver.exe");   	// System Property for Chrome Driver
    WebDriver driver=new ChromeDriver();  		// Initialize Chrome browser
    
	 
	// Open Google
	driver.get("https://www.ultimateqa.com/simple-html-elements-for-automation/");
    driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(25, TimeUnit. SECONDS);
	
	String TableName = "HTML Table with no id";
	String jobTittleInTable = "Quality Assurance Engineer";
	
	String Dynamic_XPath = "//h2[text()='"+TableName+"']/parent::div/child::table/child::tbody/child::tr/child::td[text()='"+jobTittleInTable+"']/following-sibling::td[2]";
	WebElement webelement = driver.findElement(By.xpath(Dynamic_XPath));
	System.out.println(webelement.getText());
	
	driver.close();

	}

}
