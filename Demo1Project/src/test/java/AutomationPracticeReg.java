import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationPracticeReg 
{

	@Test
	public void VerifyRegistrationPage()
	{
		
		String currentDir = System.getProperty("user.dir");
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", currentDir+"\\Drivers\\new\\chromedriver.exe");  
        
        
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit. SECONDS);
		
		//Register new email
		String email = RandomStringFactory.usingUUID()+"@gmail.com"; 
		driver.findElement(By.id("email_create")).sendKeys(email);
		driver.findElement(By.id("SubmitCreate")).click();
		
		boolean MrSelected = driver.findElement(By.id("id_gender1")).isSelected();
		boolean MrsSelected = driver.findElement(By.id("id_gender2")).isSelected();
		
		System.out.println("the salutation Mr is selected: "+MrSelected);
		System.out.println("the salutation Mrs is selected: "+MrsSelected);
		
		
		String pageHeading = driver.findElement(By.className("page-heading")).getText();
		Assert.assertEquals(pageHeading, "CREATE AN ACCOUNT");
		
		
		String tittleOFPage = driver.getTitle();
		Assert.assertEquals(tittleOFPage, "Login - My Store");
		
		// Close browser
	    driver.close();
}
}
