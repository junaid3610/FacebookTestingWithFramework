package Testcases;

import org.testng.annotations.Test;

import FBPages.FBCareerPage;

public class FBCareerTestcases extends FBLoginOrSignupTestcase {
	
	@Test(priority = 1)
	public void ClickonCareer()
	{
		FBCareerPage fbc = new FBCareerPage(driver);
		fbc.careerclk();
		
		
	}
	
	
	

}
