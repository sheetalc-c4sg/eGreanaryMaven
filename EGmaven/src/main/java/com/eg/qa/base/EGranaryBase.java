package com.eg.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.eg.qa.util.TestUtil;

public class EGranaryBase {

	 public static WebDriver driver;
	public static Properties prop;
	
	
	public EGranaryBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\eg"
					+ "\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialize()
	{
		
		String pathToBinary = "C:\\Program Files (x86)\\eGranaryBrowser\\eGranary.exe";
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setBinary(pathToBinary);
		firefoxOptions.setCapability("marionette", false);
	    driver = new FirefoxDriver(firefoxOptions);	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
			
		    
					
		   	driver.get(prop.getProperty("url"));
			
		   	
		   		
		
	}
	
		public void closeBrowser()
		{
			driver.quit();			
		}
		
		
		
}
