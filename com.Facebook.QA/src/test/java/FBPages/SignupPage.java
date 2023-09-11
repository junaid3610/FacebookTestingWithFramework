package FBPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class SignupPage {

	// First Name
	@FindBy(xpath = "//input[@name=\"firstname\"]")
	private WebElement Ftname;

	// Last Name
	@FindBy(xpath = "//input[@name=\"lastname\"]")
	private WebElement LstNm;

	// Email Address
	@FindBy(xpath="//input[@name=\"reg_email__\"]")
	private WebElement eml;

	// Password
	@FindBy(xpath="//input[@name=\"reg_passwd__\"]")
	private WebElement pw;
	
	//select day // this is drop-down
	@FindBy(xpath="//select[@title=\"Day\"]")
	private WebElement day;
	
	//Select Month // this is drop-down
	@FindBy(xpath="//select[@title=\"Month\"]")
	private WebElement mnth;
	
	// Select Year // this is Drop-down
	@FindBy(xpath="//select[@title=\"Year\"]")
	private WebElement yr;
	
	//click on Male Button
	@FindBy(xpath="//label[text()=\"Male\"]")
	private WebElement mlclk;
	
	//click on Signup Button
	@FindBy(xpath="//button[@name=\"websubmit\"]")
	private WebElement signclk; 
	
	// Take the Text
	@FindBy(xpath="//div[@class=\"mbs _52lq fsl fwb fcb\"]")
	private WebElement txt;
	
	
	
	
	// -------------------------------
	// initialization
	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	// =-========----------=============

// Usage

	public void frsname() {
		Ftname.sendKeys("Junaid");
	}

	public void lsnm()
	{
		LstNm.sendKeys("Shaikh");
	}
	
	public void email()
	{
		eml.sendKeys("Abc@gmail.com");
	}
	
	public void paswrd()
	{
		pw.sendKeys("Abc@12");
	}
	
	public void selday()
	{
		Select s = new Select(day);
		s.selectByValue("23");
	}
	
	public void  selmo()
	{
		Select s = new Select (mnth);
		s.selectByVisibleText("Jun");
	}
	
	public void selyr()
	{
		Select s = new Select (yr);
		s.selectByIndex(27);
	}
	
	public void radioclk()
	{
		mlclk.click();
	}
	
	public void SignClk()
	{
		signclk.click();
	}
	
	// signup gettext
	public void Txt()
	{			
		txt.getText();
		
	}
	
	
	
	
}
