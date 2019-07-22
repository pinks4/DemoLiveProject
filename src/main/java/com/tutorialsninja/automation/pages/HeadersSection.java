package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

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
	
	public HeadersSection(){
		PageFactory.initElements(Base.driver, this);
		
	}
	
	

}
