package com.seleniumframeworks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	
	/**

     * All WebElements are identified by @FindBy annotation

     */
	
	//WebDriver driver;
	
			@FindBy(id="loginlabel") WebElement loginClick;
			@FindBy(name="log")	WebElement uname;
			@FindBy(name="pwd") WebElement pass;
			@FindBy(name="wp-submit") WebElement loginButton;
			@FindBy(linkText="Dashboard") WebElement dasbrd;
		
	
	public LoginPage(WebDriver driver)
	{
		//to initialize the local driver variable with the actual driver we will use in our test cases.
		//the actual driver is the one we pass as an argument to the constructor.
	this.driver=driver;
	}
	
	
	public void loginToPortal(String username, String pwd) throws InterruptedException 
	
	{
		Thread.sleep(2000);
		loginClick.click();
		uname.sendKeys(username);
		pass.sendKeys(pwd);
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
	}
	
	public void verifyDashboard() throws InterruptedException
	{
		String label="Dashboard";
		String actualRslt=dasbrd.getText();
		Assert.assertEquals(actualRslt, label);
		Thread.sleep(2000);
		System.out.println("User login to Dashboard");
	}
	
	

}