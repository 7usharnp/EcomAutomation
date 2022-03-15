package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
 
	@FindBy(id="input-email")
	public static WebElement username;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(css="input[type='submit'][value='Login']")
	public static WebElement loginBtn;
	
	@FindBy(css=".alert.alert-danger.alert-dismissible")
	public static WebElement validationMsg;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgotPasswordLink;
	
	@FindBy(css=".alert.alert-success.alert-dismissible")
	public static WebElement forgotpasswordValidationLink;
	
	public LoginPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	public static void doLogin(String uname,String pwd) {
		Elements.TypeText(username, uname);
		Elements.TypeText(password, pwd);
		Elements.click(loginBtn);
	}
	
	public static void doLogin() {
		Elements.TypeText(username, Base.reader.getUsername());
		Elements.TypeText(username, Base.reader.getPassword());
		Elements.click(loginBtn);
		
		
	}
	
	
}
