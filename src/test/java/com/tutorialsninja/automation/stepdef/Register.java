package com.tutorialsninja.automation.stepdef;




import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	@Given("^I launch the application$")
	public void i_launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@And("^I navigate to account register page$")
	public void i_navigate_to_account_register_page()  {
	    
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable)  {
	   
	}

	@And("^I select on the privacy policy$")
	public void i_select_on_the_privacy_policy() {
	    
	}

	@And("^I click on Continue button$")
	public void i_click_on_Continue_button() {
	    
	}

	@Then("^I should see the user account is successfully created$")
	public void i_should_see_the_user_account_is_successfully_created()  {
	   
	}



}
