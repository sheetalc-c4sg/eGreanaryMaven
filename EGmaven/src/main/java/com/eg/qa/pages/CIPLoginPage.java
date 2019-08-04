package com.eg.qa.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eg.qa.base.EGranaryBase;

public class CIPLoginPage extends EGranaryBase {
	
	////a[text()='http://CIPEdit']

	@FindBy(id="login_usuario")
	WebElement username;
	
	@FindBy(id="login_contrasinal")
	WebElement password;
	
	
	@FindBy(name="Submit")
	WebElement submit;
	
	@FindBy(xpath= "//a[text()='Exit']")
	WebElement exit;
	
	@FindBy(xpath= "//a[text()='http://CIPEdit']")
	WebElement cipedit;
	
	
	@FindBy(xpath= "//a[text()='CIP']")
	WebElement ciplink;
	
public CIPLoginPage() {
		
		PageFactory.initElements(driver, this);
	}

public CatalogSearchPage ClickonCIPlink() throws InterruptedException
{
	ciplink.click();
	boolean isTheTextPresent = driver.getPageSource().contains("Community Information Platform (CIP)");
		assertTrue(isTheTextPresent);
	System.out.println("Tha actual text is Present" + isTheTextPresent);

	Thread.sleep(3000);
	return new CatalogSearchPage();
}

public CatalogSearchPage CIPLogin() throws InterruptedException 
{
	
	cipedit.click();
	
	boolean ciploginpage = driver.getPageSource().contains("Welcome to CIP Edit");
		assertTrue(ciploginpage);
	System.out.println("Tha actual text is Present" + ciploginpage);
	
	username.sendKeys("sshahare");
	password.sendKeys("Star@123");
	submit.click();
	Thread.sleep(3000);
	ValidateCIPeditor();
	
	return new CatalogSearchPage();
}

public CatalogSearchPage ValidateCIPeditor()
{
	
	boolean validate   = driver.getPageSource().contains("CIP Edit");
		assertTrue(validate);
	System.out.println("Tha actual text is Present" + validate);
	
	
	return new CatalogSearchPage();
}



}
