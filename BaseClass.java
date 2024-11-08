package com.TestnNG.POM.ByLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
	public WebDriver driver;
	public LoginPageUsingByLocator lp;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/back-office/pages/login.html");
		lp= new LoginPageUsingByLocator(driver);
	}

}
