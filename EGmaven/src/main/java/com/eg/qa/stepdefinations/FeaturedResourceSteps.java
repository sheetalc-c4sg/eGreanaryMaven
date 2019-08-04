package com.eg.qa.stepdefinations;

import com.eg.qa.pages.FeaturedResourcePage;

import cucumber.api.java.en.Then;

public class FeaturedResourceSteps {

	FeaturedResourcePage frpage;
	@Then("^User Validate Featured Resource$")
	public void user_Validate_Featured_Resource() throws Throwable {
		
		frpage = new FeaturedResourcePage();
		frpage.ValidateFeaturedResource();
		System.out.println("FR Validated in step defenation");
	    
	}

}
