package FBPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreatNewAccPage  {
	WebDriver driver;

// Click on Create new Account Button
	@FindBy(xpath="(//a[@role=\"button\"])[2]")
	private WebElement creatbtn;

	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement LgEml;
	
	
// -------------------------------	
 //initialization
			public CreatNewAccPage (WebDriver driver) {      
		        PageFactory.initElements(driver, this);
		    }
	
//=-========----------=============	
// Usage	
	public void clk()
	{
		creatbtn.click();
	}
	
	
	public void Logeml()
	{
		LgEml.sendKeys("abc@gmail.com");
	}
	
	
	

}
