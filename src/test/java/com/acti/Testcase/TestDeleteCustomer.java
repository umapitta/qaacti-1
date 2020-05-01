package com.acti.Testcase;

import org.testng.annotations.Test;

public class TestDeleteCustomer extends BaseTest {
	
	@Test
	public void createCustomer()
	{
		loginPage.validateLogin("admin", "manager");
		enterTimePage.clickTaskMenu();
		taskPage.enterCustomerToSearch("shantosh");
		taskPage.clickSelectedCustomer();
		taskPage.clickEditButton();
		taskPage.clickActionButton();
		taskPage.clickDeleteButton();
		taskPage.clickDeleltePermanentelyButton();
		enterTimePage.clickLogoutLink();
	}

}
