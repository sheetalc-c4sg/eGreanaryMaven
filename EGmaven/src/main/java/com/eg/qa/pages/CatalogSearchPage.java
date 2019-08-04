package com.eg.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eg.qa.base.EGranaryBase;

public class CatalogSearchPage extends EGranaryBase{
	
	@FindBy(id="cat_search_title")
	WebElement catalogsearch;
	
	@FindBy(id="search1_query")
	WebElement searchterm;
	
	@FindBy(id = "search1_submit")
	WebElement submit;
	
	@FindBy(id = "search_query")
	WebElement validsearch;
	
	@FindBy(id= "history")
	WebElement searchhistory;
	
	@FindBy(id="hd_logo")
	WebElement home;
	
	
	

	public CatalogSearchPage() {
		
		PageFactory.initElements(driver, this);
	}

	public boolean validatecatalogsearch()
	{

	 return catalogsearch.isDisplayed();
	 
	 
	}
	
	public CatalogSearchPage CSEntersearchterm()
	{
		searchterm.sendKeys(prop.getProperty("cssearch1"));
		submit.click();
		
		return new CatalogSearchPage();
	}

	public String CSValidatesearchterm()
	{
		
		return driver.getTitle();
		
	}
	
	public void gotohomepage()
	{
		home.click();
	}
	
	public CatalogSearchPage ValidateAdvancelink()
	{
		gotohomepage();
		driver.findElement(By.id("advanced")).click();
		driver.getTitle().compareTo("Advanced Search");
		return new CatalogSearchPage();
	}
	
	public CatalogSearchPage ValidateSearchHelplink()
	{
		gotohomepage();
		driver.findElement(By.linkText("Search Help")).click();
		driver.getPageSource().contains("Search Help for Full-Text Search");
		
		return new CatalogSearchPage();
	}
	
	public CatalogSearchPage ValidateSearchHistorylink()
	{
		gotohomepage();
		searchhistory.click();
		driver.getPageSource().contains("Search Help for Searching the Catalog");
		driver.getTitle().compareTo("Advanced Search");
		
		return new CatalogSearchPage();
	}


}
