package com.seleniumframeworks.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.seleniumframeworks.pages.BaseClass;
import com.seleniumframeworks.pages.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	public void loginApp() throws InterruptedException
	{
		//initElements method of Page Factory  class for initializing the WebElement
		LoginPage obj=PageFactory.initElements(driver, LoginPage.class);
		obj.loginToPortal(excl.getStringData("Sheet1", 1, 0), excl.getStringData("Sheet1", 1, 1));
		System.out.println("Able to login to portal using excel credetila : "+excl.getStringData("Sheet1", 1, 0)+" , " +excl.getStringData("Sheet1", 1, 1));
		obj.verifyDashboard();
	}
	
	
	

}
