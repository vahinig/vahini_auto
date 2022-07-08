package com.seleniumframeworks.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.seleniumframeworks.utility.BrowserFactory;
import com.seleniumframeworks.utility.ConfigureDataProvider;
import com.seleniumframeworks.utility.ExcelDataProvider;

public class BaseClass {
	
	
	public WebDriver driver;
	public ConfigureDataProvider config;
	public ExcelDataProvider excl;
	
	
	@BeforeSuite
	public void setUpSuite()
	{
		config=new ConfigureDataProvider();
		excl= new ExcelDataProvider();
	}
	
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver, config.getBrowser(), config.getUrl());
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	

}
