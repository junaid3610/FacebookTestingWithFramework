package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Base.ChromeBrowser;
import FBPages.CreatNewAccPage;


public class CreatNewAccTestcase extends ChromeBrowser {
	
	@Test(priority = 1)
	public void ClickonNewAccount()
	{
		CreatNewAccPage sp = new CreatNewAccPage(driver);
		sp.clk();
		Reporter.log("this is for performing click on Create New Account");
		
	}
	

	
	
	
	
	
	
	
}
