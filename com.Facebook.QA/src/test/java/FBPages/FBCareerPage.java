package FBPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBCareerPage {
	
	// click on career Link
		@FindBy(xpath="//a[text()=\"Careers\"]")
		private WebElement career;
	
		
		
		
		
		
		
	
	
//=====================================	
		// initialisation		
		public FBCareerPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
//======================================	
		
		
		
		// click on career link
		public void careerclk()
		{
			career.click();
		}
	
	
	
	

}
