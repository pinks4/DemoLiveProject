package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login {
	
	HeadersSection headersSection=new HeadersSection(); 
	LoginPage loginPage= new LoginPage();
	MyAccountPage myaccount= new MyAccountPage();
	ForgotPasswordPage forgotPwdPage= new ForgotPasswordPage();
	
	@And("^I navigate to account login page$")
	public void i_navigate_to_account_login_page() {
		
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.LoginBtn);
	    
	}

	@When("^I login to the application using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_login_to_the_application_using_username_and_password(String email, String password)  {
		
		LoginPage.doLogin(email, password);
		
		
		
	    
	}

	@Then("^I should be logged into my account successfully$")
	public void i_should_be_logged_into_my_account_successfully() {
		

		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.registerAffiliateAccount));
	}
	
	@Then("^I should not be logged into my account and an error message should be displayed$")
	public void i_should_not_be_logged_into_my_account_and_an_error_message_should_be_displayed() {
		
	Assert.assertTrue(LoginPage.LoginErrorMsg.isDisplayed());
		

	}
	
	@When("^I reset the forgotten password for \"([^\"]*)\" email$")
	public void i_reset_the_forgotten_password_for_email(String email)  {
		
		Elements.click(LoginPage.ForgottenPassword);
		Elements.TypeText(ForgotPasswordPage.ForgottenEmailField, email);
		Elements.click(ForgotPasswordPage.ForgottenEmailResetContinue);
		
		
	
	}

	@Then("^I should get an confirmation message of link being sent to the email address$")
	public void i_should_get_an_confirmation_message_of_link_being_sent_to_the_email_address()  {
		
		
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.resetConfirmation, "An email with a confirmation link has been sent your email address."));
		
		
		//Assert.assertTrue(LoginPage.resetConfirmation.isDisplayed());
		
	    
	  
	}





}
