package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	
	
	public CheckoutPage(){
		PageFactory.initElements(Base.driver,this);
	}
	
	
	@FindBy(id="button-payment-address")
	public static WebElement billingContinueBtn;
	
	
	@FindBy(id="button-shipping-address")
	public static WebElement deliveryDetailsContinue;
	
	@FindBy(id="button-shipping-method")
	public static WebElement deliveryMethodContinue;
	
	@FindBy(xpath="//input[@name='agree']")
	public static WebElement checkboxTerms;
	
	@FindBy(id="button-payment-method")
	public static WebElement paymentsContinue;
	
	@FindBy(id="button-confirm")
	public static WebElement confirmOrderBtn;
	
	
	
	
	public static void placeAnOrder(){
	
		Elements.click(billingContinueBtn);
		Elements.click(deliveryDetailsContinue);
		Elements.click(deliveryMethodContinue);
		Elements.click(checkboxTerms);
		Elements.click(paymentsContinue);
		Elements.click(confirmOrderBtn);
		
		
	}
	

}
