package com.eg.qa.stepdefinations;

import com.eg.qa.pages.CIPLoginPage;

import cucumber.api.java.en.Then;

public class CIPLoginSteps {
	
	CIPLoginPage ciploginpage;
	
	@Then("^User clicks on link CIP$")
	public void user_clicks_on_link_CIP() throws Throwable {
		ciploginpage = new CIPLoginPage();
		ciploginpage.ClickonCIPlink();
	    
	}

	@Then("^CIP user proceed to login$")
	public void cip_user_proceed_to_login() throws Throwable {
	    ciploginpage.CIPLogin();
		System.out.println("login successful");
	}

	@Then("^CIP editor displays after successful login$")
	public void cip_editor_displays_after_successful_login() throws Throwable {
	    ciploginpage.ValidateCIPeditor();
		System.out.println("CIP editor validated");
	}



}
