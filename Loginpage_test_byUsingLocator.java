package com.TestnNG.POM.ByLocator;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Loginpage_test_byUsingLocator extends BaseClass

//************validate and run*********************************
{
  @Test(priority=1)
  public void  validateurl()
  {
	 // LoginPageUsingByLocator lp=new  LoginPageUsingByLocator();
	// String url= lp.geturl();
	 String url= lp.geturl();
	 Assert.assertTrue(url.contains("automationplayground"),"url is not matching");
	 System.out.println("******************url is matching**********************************8");
	 
  }
  @Test(priority=2)
  public void validatetittle()
  {
	String tittle=lp.gettittle();
	Assert.assertTrue(tittle.contains("Robot"),"Tittle is not matching ********");
	System.out.println("***********tittle is matching **********************");
	  
  }
  @Test(priority=3)
  public void validateloginpage()
  {
	  lp.LoginIn("vaishuhabre123@gmail.com", "Sid@2061");
	  Assert.assertTrue(lp.geturl().contains("https://automationplayground.com/"),"case is not complete");
	  System.out.println("succesful the case");
  
	  
  }
  @AfterClass
  public void quit()
  {
	 driver.quit(); 
  }
}
