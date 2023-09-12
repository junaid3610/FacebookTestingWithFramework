package Testcases;

import org.testng.annotations.Test;

import Base.ChromeBrowser;
import FBPages.FBLoginOrSignupPage;

public class FBLoginOrSignupTestcase extends ChromeBrowser {
	
	
	
	@Test(priority = 1)
	public void EmailAddresstoLoginField()
	{
		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
		fbl.email();
	}
	
	@Test(priority = 2)
	public void ClickOnMoreLanguageButton()
	{
		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
		fbl.langclick();
	}
	
	@Test(enabled = false)
	public void CountTheAllLanguage()
	{
		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
		fbl.countlang();
	}
	
	
	@Test(priority = 4)
	public void ClickOnCloseButton()
	{
		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
		fbl.closebtn();
	}
	
	@Test(enabled = false)
	public void CountFooterLinks()
	{
		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
		fbl.count();
	}
	
	
	@Test(priority = 7)
	public void ClickOnCancelButton()
	{
		FBLoginOrSignupPage fbl =new FBLoginOrSignupPage(driver);
		fbl.cnclclik();
	}
	
	
	
	
	
	
}
