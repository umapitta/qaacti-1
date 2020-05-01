package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.Base.DriverScript;
import com.acti.Utils.Common;

public class TaskPage extends DriverScript {
	
	public TaskPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Add New']") WebElement addNewBtn;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement newCustomerBtn;
	@FindBy(xpath="(//input[@type='text' and @placeholder='Enter Customer Name'])[2]") WebElement customerNameTb;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement customerDescriptionTextarea;
	@FindBy(xpath="//div[text()='Create Customer']") WebElement createCustomerBtn;
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement customerSearchBox;
	@FindBy(xpath="//span[text()='shantosh']") WebElement customerCreated;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement editButton;	
	@FindBy(className="action") WebElement actionBtn;
	@FindBy(xpath="//div[@class='taskManagement_customerPanel']//div[@class='title'][contains(text(),'Delete')]") WebElement deleteBtn;
	@FindBy(xpath="//span[contains(text(),'Delete permanently')]") WebElement deletePermanentlyBtn;
	
	
	public void clickAddNewButton()
	{
		Common.highLightElement(addNewBtn);
		addNewBtn.click();
	}
	
	public void clickNewCustomerOption()
	{
		Common.highLightElement(newCustomerBtn);
		newCustomerBtn.click();
	}
	
	public void enterCustomerName(String custName)
	{
		Common.highLightElement(customerNameTb);
		customerNameTb.sendKeys(custName);
	}
	
	public void enterCustomerDescription(String custDescription)
	{
		Common.highLightElement(customerDescriptionTextarea);
		customerDescriptionTextarea.sendKeys(custDescription);
	}
	
	public void clickCreateCustomerButton()
	{
		Common.highLightElement(createCustomerBtn);
		createCustomerBtn.click();
	}
	
	
	public void enterCustomerToSearch(String custName)
	{
		Common.highLightElement(customerSearchBox);
		customerSearchBox.sendKeys(custName);
	}
	
	public void clickSelectedCustomer()
	{
		Common.highLightElement(customerCreated);
		customerCreated.click();
	}
	
	public void clickEditButton()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Common.highLightElement(editButton);
		editButton.click();
	}
	
	public void clickActionButton()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Common.highLightElement(actionBtn);
		actionBtn.click();
	}
	
	public void clickDeleteButton()
	{
		Common.highLightElement(deleteBtn);
		deleteBtn.click();
	}
	
	public void clickDeleltePermanentelyButton()
	{
		Common.highLightElement(deletePermanentlyBtn);
		deletePermanentlyBtn.click();
	}

}
