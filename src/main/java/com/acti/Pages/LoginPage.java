package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.Base.DriverScript;

/*
 *  Script: LoginPage
 *  Tester: Siva
 *  Verified By: Shantosh
 *  Date Created: 27/04/2020
 *  Last Modified: 27/04/2020
 */

public class LoginPage extends DriverScript {
	
//**************************************** Page Elements ************************************************//
	
	@FindBy(id="logoContainer") WebElement actiLogo;
	@FindBy(id="username") WebElement usernameTb;
	@FindBy(name="pwd") WebElement passwordTb;
	@FindBy(id="loginButton") WebElement loginBtn;
	
//**************************************** Page Initialization ******************************************//
	
	//PageFactory is a class in POM which is used to initialize the Page elements of the class
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//**************************************** Page Actions/Methods ******************************************//
	
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	}
	
	public void validateLogin(String username, String password)
	{
		usernameTb.sendKeys(username);
		passwordTb.sendKeys(password);
		loginBtn.click();
	}
	
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}

}
