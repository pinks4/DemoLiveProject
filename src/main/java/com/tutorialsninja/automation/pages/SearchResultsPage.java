package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class SearchResultsPage {
	
	public SearchResultsPage(){
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	
	@FindBy(linkText="Samsung SyncMaster 941BW")
	public static WebElement samsungSyncResult;
	
	@FindBy(css="#content>:nth-child(7)")
	public static WebElement noResults;
	
	@FindBy(xpath="//span[text()='Add to Cart'][1]")
	public static WebElement addToCart;
	
	public static void addFirstproductInSearchResultToCart(){
		Elements.click(addToCart);
	}

}
