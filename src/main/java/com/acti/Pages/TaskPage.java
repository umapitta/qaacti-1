package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Utils.Common;

public class TaskPage extends DriverScript {
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement btnAddNew;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement newCustomerOption;
	@FindBy(xpath="//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']") WebElement customerNameTb;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement customerDescriptionTextarea;
	@FindBy(xpath="//div[contains(text(),'Create Customer')]") WebElement createCustomerBtn;
	
	public TaskPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddNewButton()
	{
		Common.highLightElement(btnAddNew);
		btnAddNew.click();
	}
	
	public void clickNewCustomerOption()
	{
		Common.highLightElement(newCustomerOption);
		newCustomerOption.click();
	}
	
	public void enterCustomerName(String customerName)
	{
		Common.highLightElement(customerNameTb);
		customerNameTb.sendKeys(customerName);
	}
	
	public void enterCustomerDescritpion(String customerDescritpion)
	{
		Common.highLightElement(customerDescriptionTextarea);
		customerDescriptionTextarea.sendKeys(customerDescritpion);
	}
	
	public void clickCreateCustomerButton()
	{
		Common.highLightElement(createCustomerBtn);
		createCustomerBtn.click();
	}

}
