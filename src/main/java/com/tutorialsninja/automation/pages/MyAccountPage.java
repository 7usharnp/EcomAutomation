package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class MyAccountPage {
	
	@FindBy(linkText = "Account")
	public static WebElement accountLink;
	
	@FindBy(name = "search")
	public static WebElement searchbar;
		
	@FindBy(xpath="//input[@placeholder='Search']")
	public static WebElement searchBoxField;
	
	@FindBy(css="button[class$='btn-lg']")
    public static WebElement searchBtn;
    
	public MyAccountPage() {
		PageFactory.initElements(Base.driver, this);
	}

	public static void searchProduct(String productName) {
		   Elements.TypeText(searchBoxField, productName);
		   Elements.click(searchBtn);

	}
}
