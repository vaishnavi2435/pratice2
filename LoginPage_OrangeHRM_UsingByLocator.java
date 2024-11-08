package com.TestnNG.POM.ByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_OrangeHRM_UsingByLocator 
{
	WebDriver driver;
	
	public LoginPage_OrangeHRM_UsingByLocator (WebDriver driver)  //driver comes to base class driver
	{
		this.driver=driver;
	}
	//By locator
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='password']");
	By login=By.className("orangehrm-login-button");
	
	//Perform an method action
	
	public void login(String em,String pas)
	{
				driver.findElement(username).sendKeys(em);
				
				driver.findElement(password).sendKeys(pas);
				driver.findElement(login).click();
	}
	
	public String  getTittle()
	{
		 return driver.getTitle();
	}
	public String geturl()
	{
		return driver.getCurrentUrl();
	}

}
