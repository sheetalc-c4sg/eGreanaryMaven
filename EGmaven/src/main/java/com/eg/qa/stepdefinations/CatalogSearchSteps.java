package com.eg.qa.stepdefinations;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.eg.qa.pages.CatalogSearchPage;

import cucumber.api.java.en.Then;

public class CatalogSearchSteps {

	CatalogSearchPage catalogsearchpage;
	
	@Then("^user validate catalog  search$")
	public void user_validate_catalog_search() throws Throwable {
		catalogsearchpage = new CatalogSearchPage();
		boolean cs = catalogsearchpage.validatecatalogsearch();
		assertTrue(cs);
		System.out.println("This assertion for CS returns" + cs);
	   
	}

	@Then("^user enters catalog search term and click on find button$")
	public void user_enters_catalog_search_term_and_click_on_find_button() throws Throwable {
		
		catalogsearchpage.CSEntersearchterm();
		System.out.println("This is catalog search term page");
	    
	}

	@Then("^Validate the catalog search term$")
	public void validate_the_catalog_search_term() throws Throwable {
	   
		String cstitle = catalogsearchpage.CSValidatesearchterm();
		assertEquals("Search Results", cstitle);
		System.out.println(cstitle);
		
		
	}

	@Then("^Validate catalog Advance link$")
	public void validate_catalog_Advance_link() throws Throwable {
	    // Write code here that turns the 
		catalogsearchpage.ValidateAdvancelink();
		System.out.println("Advance link validated");
		
	}

	@Then("^Validate catalog Search History link$")
	public void validate_catalog_Search_History_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		catalogsearchpage.ValidateSearchHistorylink();
		System.out.println("Search history link validated");
	
	}

	@Then("^Validate catalog Search Help link$")
	public void validate_catalog_Search_Help_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		catalogsearchpage.ValidateSearchHelplink();
		System.out.println("Search Help link validated");
	
	}


}
