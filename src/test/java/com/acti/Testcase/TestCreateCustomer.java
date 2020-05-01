package com.acti.Testcase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;



public class TestCreateCustomer extends BaseTest {
	
	
	@Test
	public void createCustomer()
	{
		logger=extent.createTest("Create Customer under Task Menu");
		loginPage.validateLogin("admin", "manager");
		
		logger.log(Status.PASS, "Login Successfull");
		enterTimePage.clickTaskMenu();
		logger.log(Status.INFO, "Clicked on Task Menu");
		taskPage.clickAddNewButton();
		logger.log(Status.INFO, "Clicked on Add New Button");
		taskPage.clickNewCustomerOption();
		logger.log(Status.INFO, "Clicked on New Customer Option");
		taskPage.enterCustomerName("shantosh");
		logger.log(Status.INFO, "Entered Customer Name");
		taskPage.enterCustomerDescription("Test Customer Created for Automation");
		logger.log(Status.INFO, "Entered Customer Description");
		taskPage.clickCreateCustomerButton();
		logger.log(Status.INFO, "Clicked on Create Customer button");
		
		logger.log(Status.PASS, "Customer Created Successfully");
		enterTimePage.clickLogoutLink();
		logger.log(Status.PASS, "Logged out from the Application");
	}

}
