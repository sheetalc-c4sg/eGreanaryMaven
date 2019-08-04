package com.eg.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eg.qa.base.EGranaryBase;

public class EGHomePage extends EGranaryBase{
	//WebDriver driver;
	@FindBy(id="full_text_title")
	WebElement fulltextsearch;
	
	@FindBy(id="feat_res")
	WebElement featuredresource;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	public EGHomePage() {
		
		PageFactory.initElements(driver, this);
	}

	public String verifyEGHomePageTitle(){
		return driver.getTitle();
	}

		public boolean ValidateFeaturedRsource()
	{
		return featuredresource.isDisplayed();
	
	}
	
	
}

