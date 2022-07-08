package com.seleniumframeworks.utility;

import java.io.FileReader;
import java.util.Properties;

public class ConfigureDataProvider {
	
	Properties pro;
	
	public ConfigureDataProvider()
	{
		
		try {
			// create a reader object on the properties file
			FileReader reader=new FileReader("./Config/config.properties");
			// create properties object
			pro=new Properties();
			// Add a wrapper around reader object
			pro.load(reader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to load config file "+e.getMessage());
		}
				/**	
				try {
					FileInputStream fis = new FileInputStream(src);
					pro=new Properties();
					pro.load(fis);
				} catch (Exception e) {
					System.out.println("Not able to load config file "+e.getMessage());
				}
					**/				
				
				}
			
			public String getDataFromConfig(String keyToSearch)
			{
				return pro.getProperty(keyToSearch);
				
			}
			
			public String getBrowser()
			{
				return pro.getProperty("Browser");
				
			}
			
			
			public String getUrl()
			{
				return pro.getProperty("qaURL");
			}
			
	
		
		
	}


