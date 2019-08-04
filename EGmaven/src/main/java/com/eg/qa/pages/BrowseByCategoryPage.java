package com.eg.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


import org.junit.Assert;

public class BrowseByCategoryPage extends EGHomePage{

	//@FindBy(id = prop.getProperty("bbctitlevalidate"))
	//WebElement bbctitle;
	
	

	

	public BrowseByCategoryPage() {
		
		PageFactory.initElements(driver, this);
	}

	public boolean validatebbc()
	{

		//return bbctitle.isDisplayed();
		
		return driver.findElement(By.id(prop.getProperty("bbctitlevalidate"))).isDisplayed();
 
 
	}

	public BrowseByCategoryPage Validatebbclink()
	{
		
		driver.findElement(By.linkText(prop.getProperty("BBCagriLink"))).click();
		System.out.println(prop.getProperty("BBCagriLink") + " is validated" );
	
		return new BrowseByCategoryPage();
	}

	public BrowseByCategoryPage validate_next() throws InterruptedException
	{
		
		driver.findElement(By.xpath(prop.getProperty("AgriLinks"))).click();
		validate_contents();
		Thread.sleep(2000);
	//	System.out.println(prop.getProperty("BBCagriLink") + " is validated" );
	
		return new BrowseByCategoryPage();
	}
		
	public void validate_contents()
	{
		String str = driver.getTitle();
		Assert.assertEquals("Eldis", str);
		System.out.println("Navigate to categorized link page ");
		
	}
	
	/* click element by href
	 Driver.findElement(By.xpath(//a[@href ='/docs/configuration']")).click();
	 */
	
	public BrowseByCategoryPage Add_to_favrite() 
	{
		
		driver.findElement(By.xpath(prop.getProperty("AgriLinks"))).click();
		validate_contents();
		
	//	System.out.println(prop.getProperty("BBCagriLink") + " is validated" );
	
		return new BrowseByCategoryPage();
	}
		
}



