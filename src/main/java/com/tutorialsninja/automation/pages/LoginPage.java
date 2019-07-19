package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	public LoginPage(){
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement Username;
	
	@FindBy(id="input-password")
	public static WebElement Password;
	
	@FindBy(css="input[value='Login']")
	public static WebElement LoginBtn;
	
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement LoginErrorMsg;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement ForgottenPassword;
	
	@FindBy(css="div[id='account-login']>:nth-child(2)")
	public static WebElement resetConfirmation;


	public static void doLogin(String email,String password){
		
		Elements.TypeText(LoginPage.Username, email);
		Elements.TypeText(LoginPage.Password, password);
		Elements.click(LoginPage.LoginBtn);
		
		
	}
	
}
