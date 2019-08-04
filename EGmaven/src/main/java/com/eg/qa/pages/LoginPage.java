package com.eg.qa.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eg.qa.base.EGranaryBase;



public class LoginPage extends EGranaryBase {
	

	@FindBy(linkText = "Login")
	WebElement login;
	
	@FindBy(name="submit")
	WebElement submit;
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	
	
	@FindBy(id="hd_logo")
	WebElement home;
	
	
	

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	
	public LoginPage ProceedToLogin() throws InterruptedException
	{
		
	//	driver.findElement(By.linkText(prop.getProperty("BBCagriLink"))).click();
	//	System.out.println(prop.getProperty("BBCagriLink") + " is validated" );
		
		BrowseByCategoryPage bbc = new BrowseByCategoryPage();
		bbc.Validatebbclink();
		login.click();
		username.sendKeys("sshahare");
		password.sendKeys("Star@123");
		driver.findElement(By.xpath("//*[@id=\"yui-main\"]/div/div/table/tbody/tr[3]/td[2]/input")).click();
		Thread.sleep(2000);


		
		return new LoginPage();
	}
	
	public LoginPage ValidateLogin()
	{
		
		
		//boolean isTheTextPresent = driver.getPageSource().contains("Your Favorites");
		boolean isTheTextPresent = driver.getPageSource().contains("fhgfjgdhjs");
		
		assertTrue(isTheTextPresent);
		System.out.println("Tha actual text is Present" + isTheTextPresent);
		
		
			
		
	//	driver.findElement(By.xpath("//(text(), 'Your Favorites')") );
	//driver.findElement(By.xpath("//(text(), 'Your Favorites')") );

		return  new LoginPage();
	}
	
	
}




