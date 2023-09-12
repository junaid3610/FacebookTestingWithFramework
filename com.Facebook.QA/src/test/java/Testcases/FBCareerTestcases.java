package Testcases;

import org.testng.annotations.Test;

import FBPages.FBCareerPage;

public class FBCareerTestcases extends FBLoginOrSignupTestcase {
	
	// click on career link
	@Test(priority = 6)
	public void ClickonCareer()
	{
		FBCareerPage fbc = new FBCareerPage(driver);
		fbc.careerclk();	
	}
	
	@Test(enabled = false)
	public void FindJobOnCareerPage()
	{
		FBCareerPage fbc = new FBCareerPage(driver);
		fbc.findjob();
	}
	
	
	@Test(priority = 7)
	public void CountTotalHeaderLinks()
	{
		FBCareerPage fbc = new FBCareerPage(driver);
		fbc.Count();
	}
	
	

	
	
	
	
}
