package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	
	public RegisterPage(){
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastName;
	
	@FindBy(id="input-email")
	public static WebElement emailId;
	
	@FindBy(id="input-telephone")
	public static WebElement telephoneNo;
	
	@FindBy(id="input-password")
	public static WebElement passwordField;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmPwd;
	
	@FindBy(name="agree")
	public static WebElement privacyCheckbox;
	
	@FindBy(xpath="//*[@id='content']/form/div/div/input[2]")
	public static WebElement continueBtn;
	
	@FindBy(linkText="Register")
	public static WebElement registerBreadCrumb;
	
	@FindBy(xpath="//*[@id='account']/div[2]/div/div")
	public static WebElement firstErrorMsg;
	

	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement secondErrorMsg;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement emailErrorMsg;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement telephoneErrorMsg;
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement passwordErrorMsg;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainErrorMsg;
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement subscribeCheckbox;
	
	public static void enterAllDetails(DataTable dataTable,String typeOfAccount){
		Map<String,String> map =dataTable.asMap(String.class, String.class);

		Elements.TypeText(RegisterPage.firstName,map.get("FirstName"));
		Elements.TypeText(RegisterPage.lastName,map.get("LastName"));
		Elements.TypeText(RegisterPage.telephoneNo,map.get("Telephone"));
		Elements.TypeText(RegisterPage.passwordField,map.get("Password"));
		Elements.TypeText(RegisterPage.confirmPwd,map.get("Password"));
		
		if(typeOfAccount.equalsIgnoreCase("duplicate")){
			Elements.TypeText(RegisterPage.emailId,map.get("Email"));
			
		}else{
			 //the time stamp allows the user to be unique instead of having duplicate email
			Elements.TypeText(RegisterPage.emailId,System.currentTimeMillis()+map.get("Email"));
		}
	
		
	
	}
	

}
