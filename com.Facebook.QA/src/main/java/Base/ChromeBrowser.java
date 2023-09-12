package Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChromeBrowser {
	
	
	protected WebDriver driver;
	
	@BeforeClass
	public WebDriver driverInitialization() 
	{
		System.setProperty("webdriver.chrome,driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 (5)\\chromedriver.exe");		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");		
		driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");	
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	// to get the title	
//		String title = driver.getTitle();
//		System.out.println("Title of page => "+title);
//		return driver;
//	
//	}
	
	@BeforeSuite
	public void Suit1()
	{
		System.out.println("Suit is Starting");
	}
	
// to get the title of page	
	@Test(enabled = false)   
	public void Title()
	{
		// to get the title				
		String title = driver.getTitle();		
		Reporter.log("This is the Title of Page =>"+ title);
					
	}
	
	// to nevigate back, this will navigate after every class 
	@AfterSuite(enabled = false)
	public void navigate()
	{
		driver.navigate().back();
		System.out.println("Suite 1 is completed");
		Reporter.log("This is navigate back Method");
	}

	
	
	
	
	

}
