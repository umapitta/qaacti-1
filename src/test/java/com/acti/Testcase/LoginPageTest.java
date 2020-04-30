package com.acti.Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 *  Script: TC-LoginPage
 *  Tester: 
 *  Verified By: 
 *  Date Created: 27/04/2020
 *  Last Modified: 27/04/2020
 */

public class LoginPageTest extends BaseTest {
	
	
	@Test(priority=1)
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
	}
	
	@Test(priority=4)
	public void testValidateLoginFunction1()
	{
		lp.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

}
