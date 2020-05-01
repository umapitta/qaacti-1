package com.acti.Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.acti.Base.DriverScript;
import com.acti.Pages.EnterTimePage;
import com.acti.Pages.LoginPage;
import com.acti.Pages.TaskPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest extends DriverScript {
		
	ExtentHtmlReporter htmlReport;
	ExtentReports extent;
	ExtentTest logger;
	LoginPage loginPage;
	EnterTimePage enterTimePage;
	TaskPage taskPage;
	
	public BaseTest()
	{
		super();
	}
	
	@BeforeClass
	public void preClass()
	{
		htmlReport = new ExtentHtmlReporter("./actiReports/AutomationReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
	}
	
	@BeforeMethod
	public void preTest()
	{
		initApp();
		loginPage = new LoginPage();
		enterTimePage = new EnterTimePage();
		taskPage = new TaskPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		extent.flush();
	}
	

}
