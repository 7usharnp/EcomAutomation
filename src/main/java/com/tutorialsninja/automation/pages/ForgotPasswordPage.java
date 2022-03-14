package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class ForgotPasswordPage {
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgotPassLink;
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement continueBtn;
	
	public ForgotPasswordPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	public static void fillForgotPasswordForm(String emailId) {
		Elements.TypeText(email, emailId);
		Elements.click(continueBtn);
		
	}

}
