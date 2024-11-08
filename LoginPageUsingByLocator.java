package com.TestnNG.POM.ByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageUsingByLocator
{
	
	//Encapsulation=data+function 
	WebDriver driver;
	
	public LoginPageUsingByLocator(WebDriver driver)//driver comeing form base class driver
	{
		this .driver=driver;
	}
	
	//By locator
	By email=By.name("email");
	By password=By.name("password");
	By login=By.linkText("Login");
	
	///method on action 
	
	public void  LoginIn(String em,String psw)
	{
		driver.findElement(email).sendKeys("vaishuhabare123@gmail.com");
		driver.findElement(password).sendKeys("Sid@2061");
		driver.findElement(login).click();
	}
	public String gettittle()
	{
		 return driver.getTitle();
	}	
	
	public String geturl()
	{
		 return driver.getCurrentUrl();
	}
		
		
		
		
	
		
	
	
	
	
	
	

}
