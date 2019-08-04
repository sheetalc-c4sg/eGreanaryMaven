package com.eg.qa.stepdefinations;

import com.eg.qa.pages.ValidateAllLinks;

import cucumber.api.java.en.Then;

public class ValidateAllLinksSteps {
	
	ValidateAllLinks validateall = new ValidateAllLinks();
	@Then("^Validate any broken links$")
	public void validate_any_broken_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   validateall.CheckLinks();
	   System.out.println("*********Validated*********");
	}

}
