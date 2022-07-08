package com.seleniumframeworks.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	
	public static WebDriver startApplication(WebDriver driver, String browser, String appUrl)
	{
		
		if (browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			
		}
		else if(browser.equals("IE"))
				{
			
				}
		else
		{
			System.out.println("Browser is not supported");
		}
		
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.close();
		//driver.quit();
	}

}
