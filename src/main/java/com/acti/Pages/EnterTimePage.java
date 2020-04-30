package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Utils.Common;

public class EnterTimePage extends DriverScript {
	
	@FindBy(id="logoutLink") WebElement logoutLink;
	@FindBy(id="container_tasks") WebElement taskMenu;
	@FindBy(xpath="//a[@class='userProfileLink username']") WebElement userLoggedName;
	
	public EnterTimePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogoutLink()
	{
		Common.highLightElement(logoutLink);
		logoutLink.click();
	}
	
	public void clickTaskMenu()
	{
		Common.highLightElement(taskMenu);
		taskMenu.click();
	}
	
	public String getUserLoggedInText()
	{
		Common.highLightElement(userLoggedName);
		return userLoggedName.getText();
	}

}
