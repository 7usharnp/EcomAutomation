package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class MyAccountPage {
	
	@FindBy(linkText = "Account")
	public static WebElement accountLink;
	
	public MyAccountPage() {
		PageFactory.initElements(Base.driver, this);
	}

}
