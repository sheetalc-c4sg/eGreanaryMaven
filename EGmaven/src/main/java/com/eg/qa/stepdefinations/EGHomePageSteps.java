package com.eg.qa.stepdefinations;

import com.eg.qa.base.EGranaryBase;
import com.eg.qa.pages.EGHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class EGHomePageSteps extends EGranaryBase  {
	EGHomePage eghomepage = new EGHomePage();
	
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	   EGranaryBase.initialize();
		
	    	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		
		String title = eghomepage.verifyEGHomePageTitle();
		System.out.println("This Prints-----  "+title);
		Assert.assertEquals("eGranary Catalog", title);
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    eghomepage.closeBrowser();
	}

	@Then("^enter search term$")
	public void enter_search_term() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Validate search term$")
	public void validate_search_term() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	

}
