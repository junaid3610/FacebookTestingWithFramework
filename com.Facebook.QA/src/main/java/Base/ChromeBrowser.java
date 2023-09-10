package Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	// to get the title	
		String title = driver.getTitle();
		System.out.println("Title of page => "+title);
		return driver;
	
	}
	
	@BeforeSuite
	public void Suit1()
	{
		System.out.println("Suit 1 is Starting");
	}
	
	
	
	
	
	
	

}
