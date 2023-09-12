package Testcases;

import org.testng.annotations.Test;

import Base.ChromeBrowser;
import FBPages.FBLoginOrSignupPage;

public class FBLoginOrSignupTestcase extends ChromeBrowser {
	
	
	// Send email to username field of login 
	@Test(priority = 1)
	public void EmailAddresstoLoginField()
	{
		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
		fbl.email();
	}
	
	// click on more language + button
	@Test(priority = 2)
	public void ClickOnMoreLanguageButton()
	{
		
		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
		fbl.langclick();
	}
	
	// count the list of all langauge
	@Test(enabled = false)
	public void CountTheAllLanguage()
	{
		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
		fbl.countlang();
	}
	
	// click on close button
	@Test(priority = 4)
	public void ClickOnCloseButton()
	{
		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
		fbl.closebtn();
	}
	
	// count the footerLinks in facebook Login
	
	@Test(enabled = false)
	public void CountFooterLinks()
	{
		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
		fbl.count();
	}
	
	// click on cancel button
	
	
//	@Test(priority = 5)
//	public void ClickOnCancelButton()
//	{
//		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
//		fbl.cnclclik();
//	}
	
	
	
	
	
	
}
