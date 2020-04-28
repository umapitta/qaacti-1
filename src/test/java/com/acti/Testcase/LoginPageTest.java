package com.acti.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.acti.Base.DriverScript;
import com.acti.Pages.LoginPage;

/*
 *  Script: TC-LoginPage
 *  Tester: 
 *  Verified By: 
 *  Date Created: 27/04/2020
 *  Last Modified: 27/04/2020
 */

public class LoginPageTest extends DriverScript {
	
	
	LoginPage lp;
	
	public LoginPageTest() 
	{
		//super keyword is used to call the parent class constructor
		super();
	}
	
	@BeforeMethod
	public void preTest()
	{
		initApp();
		lp = new LoginPage();
	}
	
	@AfterMethod
	public void postTest()
	{
		driver.close();
	}
	
/*	@Test(priority=1)
	public void testVerifyActiLogo()
	{
		boolean flag = lp.verifyActiLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void testLoginPageTitle()
	{
	
		String title = lp.verifyLoginPageTitle();
		Assert.assertEquals("actiTIME - Login", title);
	}
	
	@Test(priority=3)
	public void testValidateLoginFunction()
	{
		lp.validateLogin("admin", "manager");
	}*/
	
	@Test(priority=4)
	public void testValidateLoginFunction1()
	{
		lp.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

}
