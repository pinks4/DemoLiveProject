package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Search {
	
	
	HeadersSection headerSection=new HeadersSection();
	SearchResultsPage searchResultsPage= new SearchResultsPage();
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String searchText) {
		Elements.TypeText(HeadersSection.searchField,searchText);
		Elements.click(HeadersSection.searchButton);
	    
	}

	@Then("^I should see the product in the search results$")
	public void i_should_see_the_product_in_the_search_results() {
		
		Assert.assertTrue(Elements.isDisplayed(SearchResultsPage.samsungSyncResult));
	    
	}
	
	@Then("^I should see the message \"([^\"]*)\" on the search results page$")
	public void i_should_see_the_message_on_the_search_results_page(String message) {
		
		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultsPage.noResults, message));
		
		
	    
	}





}
