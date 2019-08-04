package com.eg.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eg.qa.base.EGranaryBase;

public class FeaturedResourcePage extends EGranaryBase  {
	
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
	
public FeaturedResourcePage() {
		
		PageFactory.initElements(driver, this);
	}


public FeaturedResourcePage ValidateFeaturedResource() 
{
	//driver.findElement(By.id("adimage")).click();
	
	//Thread.sleep(3000);
//	driver.findElement(By.xpath("//img[@id='adimage']")).click();
	
	//Wait<WebDriver> gWait = new FluentWait<WebDriver>(pDriver).withTimeout(Duration.ofSeconds(100))
	  //      .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
	
	new WebDriverWait(driver, 10).pollingEvery(Duration.ofMillis(4000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@id='adimage']"))).click();
	System.out.println(driver.getCurrentUrl());
	System.out.println("Featured resources link clicked");
	return new FeaturedResourcePage();
}

}
