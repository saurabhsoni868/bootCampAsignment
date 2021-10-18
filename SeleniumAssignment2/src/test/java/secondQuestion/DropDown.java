package secondQuestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown 
{
	

	@Test
	public void test1()
	{
	String currentDir = System.getProperty("user.dir");
	// System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", currentDir+"\\Drivers\\new\\chromedriver.exe");   	// System Property for Chrome Driver
    WebDriver driver=new ChromeDriver();  		// Initialize Chrome browser
    
	 
	// Open Google
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(25, TimeUnit. SECONDS);
	
	// Create the object of the Select class
	Select oldStyleSelectMenu = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
	boolean isMultipleDropDown = oldStyleSelectMenu.isMultiple();
	System.out.println("This Drop-Down is MultiSelect: "+isMultipleDropDown);
	driver.close();
	}
	
	
	@Test
	public void test2()
	{
	String currentDir = System.getProperty("user.dir");
	// System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", currentDir+"\\Drivers\\new\\chromedriver.exe");   	// System Property for Chrome Driver
    WebDriver driver=new ChromeDriver();  		// Initialize Chrome browser
    
	 
	// Open Google
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(25, TimeUnit. SECONDS);
	
	// Create the object of the Select class
	Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
	// Get all the options of the dropdown
	List<WebElement> options = select.getOptions();
	System.out.println("The List of available DropDowns are");
	for(WebElement i :options)
	{
		System.out.println(i.getText());
	}
	driver.close();
	
	}
	
	@Test
	public void test3()
	{
	String currentDir = System.getProperty("user.dir");
	// System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", currentDir+"\\Drivers\\new\\chromedriver.exe");   	// System Property for Chrome Driver
    WebDriver driver=new ChromeDriver();  		// Initialize Chrome browser
    
	 
	// Open Google
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(25, TimeUnit. SECONDS);
	
	// Create the object of the Multi Select class
	Select select = new Select(driver.findElement(By.id("cars")));
	
	//selecting Red then Clue then Green
	select.selectByVisibleText("Volvo");
	select.selectByVisibleText("Saab");
	select.selectByVisibleText("Audi");
	
	//fetching the last selected option and  & all selected option
	List<WebElement> selected_options = select.getAllSelectedOptions();
	//fetching the last selected option
	System.out.println("The last selected Option is: "+selected_options.get(selected_options.size()-1).getText());
	//fetching the all selected option
	System.out.println("List of all the Selected Options");
	for(WebElement i :selected_options)
	{
		System.out.println(i.getText());
	}
	
	//fetching the De-select the  selected option
	select.deselectAll();
	
	driver.close();
	
	}
}
