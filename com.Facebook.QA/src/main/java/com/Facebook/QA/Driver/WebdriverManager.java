package com.Facebook.QA.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://fast.com/");
//		
//		WebElement a = driver.findElement(By.xpath("//div[@id=\"speed-value\"]"));
//		Thread.sleep(10000);
//		System.out.println(a.getText());
		
		
		// handlling the list of fb signup
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement l1 = driver.findElement(By.id("month")); 
//		 System.out.println(l1.getText());
//		 System.out.println(l1.getSize());
		 
		Select s =new Select(l1);
		s.getFirstSelectedOption();
		
		
		
	}
	

}
