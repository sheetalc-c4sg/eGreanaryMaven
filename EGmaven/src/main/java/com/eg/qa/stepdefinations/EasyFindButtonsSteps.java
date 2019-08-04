package com.eg.qa.stepdefinations;

import com.eg.qa.pages.EasyfindButtonsPage;

import cucumber.api.java.en.Then;

import org.junit.Assert;

public class EasyFindButtonsSteps {
	
	EasyfindButtonsPage easyfindbuttonpage = new EasyfindButtonsPage();
	@Then("^Validate Easy Find Button$")
	public void validate_Easy_Find_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    boolean efb = easyfindbuttonpage.validate_efb();
	    Assert.assertTrue(efb);
	    System.out.println("Easy find button Validated." + efb);
	}
	
	@Then("^Click And Validate Audio link$")
	public void click_on_Audio_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    easyfindbuttonpage.click_audiobutton();
	    System.out.println("Audio page vaidated");
	}
	
	@Then("^Click and Validate Video link$")
	public void click_and_Validate_Video_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    easyfindbuttonpage.click_video_button();
	    System.out.println("Vidio page is validated");
	}

	
	



}
