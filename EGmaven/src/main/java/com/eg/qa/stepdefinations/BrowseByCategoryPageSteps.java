package com.eg.qa.stepdefinations;

import static org.junit.Assert.assertTrue;

import com.eg.qa.pages.BrowseByCategoryPage;

import cucumber.api.java.en.Then;

public class BrowseByCategoryPageSteps {
	
	BrowseByCategoryPage bbcpage;
	
	@Then("^Validate Browse by category$")
	public void validate_Browse_by_category() throws Throwable {
		bbcpage = new BrowseByCategoryPage();
		boolean bbc = bbcpage.validatebbc();
		System.out.println("This is  "+ bbc);
		assertTrue(bbc);
		
	    // Write code here that turns the phrase above into concrete actions
	    
		
	}
	
	

	@Then("^user clicks on link under BBC$")
	public void user_clicks_on_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	bbcpage.Validatebbclink();
	
	}

	@Then("^Click and Validate Categorized link$")
	public void click_and_Validate_Categorized_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    bbcpage.validate_next();
	    System.out.println("Categorized page validated");
	}

}
