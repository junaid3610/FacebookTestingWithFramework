package FBPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FBLoginOrSignupPage {
	//decleration
// Send email to username field of login 	 
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement emailad;

	@FindBy(xpath="//a[@title=\"Show more languages\"]")
	private WebElement plusbtn; 

// count the list of all langauge
	@FindBys({@FindBy(xpath="//div[@id='language_container']/div[1]/div/ul/li")})
	private List <WebElement> language;
	
// click on close button
	@FindBy(xpath="//div[@class=\"pam uiOverlayFooter uiBoxGray topborder\"]/a")
	private WebElement close;
	
// count the footerLinks in facebook Login
	@FindBys({@FindBy(xpath="//div[@id=\"pageFooterChildren\"]/ul/li")})
	private List<WebElement> footerlink;
	

	
// click on cancel button
	@FindBy(xpath="(//span[@class=\"x1mp1tr5 x1f6kntn\"])[1]")
	private WebElement cancelclick;
	
	
	
	
// =============================	
// initialisation
	
	public FBLoginOrSignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
//================================	
	
	// Usage
	// send email on username field  
	public void email()
	{
		emailad.sendKeys("Abc@gmail.com");
	}
	
	// click on + button to
	public void langclick()
	{
		plusbtn.click();
	}
	
	// Count the Links
	public void countlang()
	{
		language.size();
		for(int i=0;i<=language.size();i++) {
			String links = language.get(i).getText();			
			System.out.println(links);		
			Reporter.log(links);
		}
		
		
		
	}
	
	
	// click on close button 
	public void closebtn()
	{
		close.click();
	}
	
	// count the total footer Links
	public void count()
	{
		footerlink.size();
		for(int i=0;i<=footerlink.size();i++) {
			String foterlinks=footerlink.get(i).getText();					
			Reporter.log("The Links are given below "+foterlinks);
			System.out.println("The total links are=> "+foterlinks);
		}
		
		
	}
	
	
	
	
	// click on cancel button
	public void cnclclik()
	{
		cancelclick.click();
	}
	
	
	
	
}
