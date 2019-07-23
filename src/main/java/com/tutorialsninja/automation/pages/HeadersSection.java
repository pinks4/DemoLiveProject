package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection {
	
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement myAccountLink;
	
	@FindBy(linkText="Register")
	public static WebElement RegisterBtn;
	
	@FindBy(linkText="Login")
	public static WebElement LoginBtn;
	
	@FindBy(name="search")
	public static WebElement searchField;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement searchButton;
	
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement shoppingCart;
	
	public HeadersSection(){
		PageFactory.initElements(Base.driver, this);
		
	}
	
	public static void navigateToLoginPage(){
		Elements.click(myAccountLink);
		Elements.click(LoginBtn);
	}
	
	public static void searchForProduct(){
		Elements.TypeText(searchField, Base.reader.getProduct());
		Elements.click(searchButton);
	}
	
	
	public static void navigateToShoppingCart(){
		
		Elements.click(shoppingCart);
	}
	

}
