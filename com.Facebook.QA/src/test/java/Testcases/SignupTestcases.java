package Testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Base.ChromeBrowser;
import FBPages.CreatNewAccPage;
import FBPages.SignupPage;


public class SignupTestcases extends CreatNewAccTestcase  {
	
// Send First Name 	
	@Test(priority = 2)
	public void FirstName()
	{
		SignupPage sp = new SignupPage(driver);
		sp.frsname();
	}
	
// Send Last Name 	
	@Test(priority = 3)
	public void LastName()
	{
		SignupPage sp = new SignupPage(driver);
		sp.lsnm();
	}

// Send emailaddress	
	@Test(priority = 4)
	public void EmailAddress()
	{
		SignupPage sp = new SignupPage(driver);
		sp.email();
	}
	
	// Send Password	
		@Test(priority = 5)
	public void Passwords()
		{
			SignupPage sp = new SignupPage(driver);
			sp.paswrd();
		}
	
	// Select Day dropdown
		
		@Test(priority = 6)
	public void SelectDay()
		{
			SignupPage sp = new SignupPage(driver);
			sp.selday();
		}
			
	// Select Month Dropdown
		@Test(priority = 7)
	public void SelectMonth()
		{
			SignupPage sp = new SignupPage(driver);
			sp.selmo();
		}
	
	// Select year Dropdown
	@Test(priority = 8)
	public void SelectYear()
	{
		SignupPage sp = new SignupPage(driver);
		sp.selyr();
	}
	
	// Click on Male Radio button	
	@Test(priority = 9)
	public void ClickOnMaleButton()
	{
		SignupPage sp = new SignupPage(driver);
		sp.radioclk();
	}
	
	// click on SignUp Button
	@Test(priority = 10)
	public void CLickOnSignUpButton()
	{
		SignupPage sp = new SignupPage(driver);
		sp.SignClk();
		
	}
	
	@Test(priority = 11)
	public void Text()
	{
		SignupPage sp = new SignupPage(driver);
		sp.Txt();	
		
	}
	
	
		
	
	
	// priority 12 completed.ready for 13
	
	
	
	

}
