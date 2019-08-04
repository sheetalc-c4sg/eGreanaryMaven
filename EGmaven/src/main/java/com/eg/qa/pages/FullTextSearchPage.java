package com.eg.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eg.qa.base.EGranaryBase;

public class FullTextSearchPage extends EGranaryBase {
	
	@FindBy(id="full_text_title")
	WebElement ftssearch;
	
	@FindBy(id="query2")
	WebElement searchterm;
	
	@FindBy(id = "saveForm")
	WebElement submit;
	
	@FindBy(id = "search_query")
	WebElement validsearch;
	
	@FindBy(id="small-logo")
	WebElement home;
	
	public FullTextSearchPage() {
		
		PageFactory.initElements(driver, this);
	}

	


	public boolean validatefulltextsearch()
	{

	 return ftssearch.isDisplayed();
	 
	 
	}
	
	public FullTextSearchPage Entersearchterm()
	{
		searchterm.sendKeys(prop.getProperty("ftssearch1"));
		submit.click();
		
		return new FullTextSearchPage();
	}

	public String Validatesearch()
	{
		
		return driver.getTitle();
		
	}
	
	public void gotohomepage()
	{
		home.click();
	}
	
	public FullTextSearchPage ValidateAdvancelink()
	{
		gotohomepage();
		driver.findElement(By.linkText("Advanced")).click();
		driver.getPageSource().contains("Advanced Full-Text Search");
		return new FullTextSearchPage();
	}
	
	public FullTextSearchPage ValidateSearchHelplinlk()
	{
		driver.findElement(By.id("hd_logo")).click();
		driver.findElement(By.linkText("Search Help")).click();
		driver.getPageSource().contains("Search Help for Full-Text Search");
		
		return new FullTextSearchPage();
	}
	
}
