package com.eg.qa.stepdefinations;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.eg.qa.pages.FullTextSearchPage;

import cucumber.api.java.en.Then;

public class FullTestSearchSteps {
	
	FullTextSearchPage fulltextsearch;
	
	@Then("^user validate full text search$")
	public void user_validate_full_text_search() throws Throwable {
	    
		 fulltextsearch = new FullTextSearchPage();
		boolean flag = fulltextsearch.validatefulltextsearch();
		
		assertTrue(flag);
		System.out.println(flag);
		
	}

	@Then("^enter search term and click on find button$")
	public void enter_search_term_and_click_on_find_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fulltextsearch.Entersearchterm();
	    System.out.println("test");
	}

	@Then("^Validate the search term$")
	public void validate_the_search_term() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 String title =  fulltextsearch.Validatesearch();
		 System.out.println(title);
		 assertEquals("eGranary Full Text Search", title);
		
	}
	@Then("^Validate Advance link$")
	public void validate_Advance_link() throws Throwable {
		fulltextsearch.ValidateAdvancelink();
		System.out.println("Advance link pass");
	    
	}

	@Then("^Validate Search Help link$")
	public void validate_Search_Help_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fulltextsearch.ValidateSearchHelplinlk();
	    System.out.println("Search help link pass");
	}


	
}
