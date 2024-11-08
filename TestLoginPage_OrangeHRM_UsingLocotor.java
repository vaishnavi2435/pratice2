package com.TestnNG.POM.ByLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage_OrangeHRM_UsingLocotor extends  BaseClass_OrangeHRM 
{
  @Test(priority=1)
  public void validateurl()
  {
	 String url= lp.geturl();
	 //*******validate****************
	 Assert.assertTrue(url.contains("login"),"url is not matching");
	 System.out.println("*******************url is matching*************************"+url);
	 
	  
  }
  @Test(priority=2)
  public void validatetittle()
  {
	 String tittle= lp.getTittle();
	 //********validate***********
	 Assert.assertTrue(tittle.contains("HRM"),"tittle is not matching");
	 System.out.println("*************tittle is  matching**************"+tittle);
  }
  @Test(priority=3)
  public void validateloginpage()
  {
	  lp.login("Admin", "admin123");
	  
	  //***********validate*******
	  Assert.assertTrue(lp.geturl().contains("dashboard/index"),"login is not complete");
	  
	  System.out.println("**********login succesful complete********* ");
	  
  }
  
}
