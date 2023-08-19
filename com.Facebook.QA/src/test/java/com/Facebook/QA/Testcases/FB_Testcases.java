package com.Facebook.QA.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Facebook.QA.Driver.DriverInitialization;

public class FB_Testcases extends DriverInitialization {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void loginToApplication() {
		driver.get("https://www.facebook.com/login/");
	
	}
	
	
	
	
}

