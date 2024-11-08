package com.TestnNG.POM.ByLocator;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass_OrangeHRM 
{
	public WebDriver driver;
	public LoginPage_OrangeHRM_UsingByLocator lp;
	
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp=new LoginPage_OrangeHRM_UsingByLocator(driver);
		
		
	}
	

}
