package com.Facebook.QA.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverInitialization {
	
	@Test
	public void browserinitialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\Chromedriver_win32 107\\chromedriver 107.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		
	}
	
	

}
