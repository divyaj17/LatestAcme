package com.acme.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.acme.testng.api.base.ProjectSpecificMethods;
import com.aventstack.extentreports.ExtentTest;

public class DashboardPage extends ProjectSpecificMethods
{
	public DashboardPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test)
	{
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);
	}		

	public DashboardPage verifyPageTitle()
	{
		String title=driver.getTitle();
		System.out.println("Page title is :" +title);
		return this;
	}
	
	
}
