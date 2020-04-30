package com.acti.Testcase;

import org.testng.annotations.Test;

public class TestCreateCustomer extends BaseTest {
	
	
	@Test
	public void testCreateCustomer()
	{
		lp.validateLogin("admin", "manager");
		String userlogged = etp.getUserLoggedInText();
		System.out.println(userlogged);
		etp.clickTaskMenu();
		tp.clickAddNewButton();
		tp.clickNewCustomerOption();
		tp.enterCustomerName("TestCustomer12");
		tp.enterCustomerDescritpion("Creating Dummy Customer for Test");
		tp.clickCreateCustomerButton();
		etp.clickLogoutLink();
	}

}
