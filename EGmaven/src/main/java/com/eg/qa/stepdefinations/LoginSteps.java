package com.eg.qa.stepdefinations;

import com.eg.qa.pages.LoginPage;

import cucumber.api.java.en.Then;

public class LoginSteps {
	
	LoginPage loginpage = new LoginPage();

	
	@Then("^User Proceed to Login$")
	public void user_Proceed_to_Login() throws Throwable {
	   loginpage.ProceedToLogin();
	   
	}

	@Then("^Validate Login Page$")
	public void validate_Login_Page() throws Throwable {
		
		loginpage.ValidateLogin();
		System.out.println("Login Page is validated");
	    
	}


}
