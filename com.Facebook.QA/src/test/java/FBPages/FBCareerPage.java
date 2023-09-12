package FBPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FBCareerPage {
	
	// click on career Link
		@FindBy(xpath="//a[text()=\"Careers\"]")
		private WebElement career;
	

	// find open jobs in career page
		@FindBy(id="_8ww0 _a5px")
		private WebElement fndjobs;
		
	// count the header link the meta career 
		@FindBys({@FindBy(xpath="//div[@class=\"_3w9z _a2pg _1p05 _2t6c _5kni\"]/div")})
		private List<WebElement> hdrlink;
	
//=====================================	
		// initialisation		
		public FBCareerPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
//======================================	
		
// usage		
		
		// click on career link
	public void careerclk()
	{
		career.click();
	}
	
	//search Job
	public void findjob()
	{
		fndjobs.sendKeys("QA Engineer");
	}
	
	
	// count the header links on Career page
	public void Count()
	{
		System.out.println(hdrlink.size());
		for(int i=0;i<=hdrlink.size();i++) {
			String hederlinks = hdrlink.get(i).getText();
			System.out.println(hederlinks);
		}
		
		
	}

}
