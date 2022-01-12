package com.driverSetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverSetup {
	
	public static WebDriver driver;
	
	public static Properties p;
	
	
	public  driverSetup() throws Exception
	{
		p = new Properties();
		
		InputStream is = new FileInputStream("D:\\Eclipse\\BDDTesting\\Property\\configuration.properties");
		
		p.load(is);
			
	}
	
	public static void invokeBrowser() throws Exception
	{
		    
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
	
	}

}
