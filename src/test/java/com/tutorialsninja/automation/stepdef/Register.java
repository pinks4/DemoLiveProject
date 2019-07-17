package com.tutorialsninja.automation.stepdef;




import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	HeadersSection headersSection=new HeadersSection();
	RegisterPage registerpage=new RegisterPage();
	AccountSuccessPage accountSuccessPage= new AccountSuccessPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@And("^I navigate to account register page$")
	public void i_navigate_to_account_register_page()  {
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.RegisterBtn);
		    
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable)  {
		
		RegisterPage.enterAllDetails(dataTable,"unique");
		
	   
		
	}

	@And("^I select on the privacy policy$")
	public void i_select_on_the_privacy_policy() {
		Elements.click(RegisterPage.privacyCheckbox);
	    
	}

	@And("^I click on Continue button$")
	public void i_click_on_Continue_button() {
		Elements.click(RegisterPage.continueBtn);
	    
	}

	@Then("^I should see the user account is successfully created$")
	public void i_should_see_the_user_account_is_successfully_created()  {
		
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successBreadCrumb));

	}
	
	@Then("^I should see that the user account is not created$")
	public void i_should_see_that_the_user_account_is_not_created() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerBreadCrumb));
	
		
	}

	@Then("^I should see an error message informing the user to enter the mandatory fields$")
	public void i_should_see_an_error_message_informing_the_user_to_enter_the_mandatory_fields()  {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstErrorMsg));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.secondErrorMsg));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailErrorMsg));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephoneErrorMsg));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordErrorMsg));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.mainErrorMsg));
		
		}
	
	@When("^I subscribe to the newsletter$")
	public void i_subscribe_to_the_newsletter() {
		Elements.click(RegisterPage.subscribeCheckbox);
		
	    
	}
	
	@When("^I provide all the below duplicate  details$")
	public void i_provide_all_the_below_duplicate_details(DataTable dataTable)  {
		
		RegisterPage.enterAllDetails(dataTable,"duplicate");
		
	}

	@Then("^I should see the user is restricted from creating a duplicate account$")
	public void i_should_see_the_user_is_restricted_from_creating_a_duplicate_account()  {
		
		Elements.VerifyTextEquals(RegisterPage.mainErrorMsg, "Warning: E-Mail Address is already registered!");
		
	    
	}



}
