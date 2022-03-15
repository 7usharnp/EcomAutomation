package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeaderSection {

	@FindBy(xpath="//span[normalize-space()='My Account']")
	public static WebElement myAccountLink;
	
	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement Login;
	
	@FindBy(linkText = "Account")
	public static WebElement accountLink;
	
	@FindBy(name = "search")
	public static WebElement searchbar;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public static WebElement searchBoxField;
	
	@FindBy(css="button[class$='btn-lg']")
    public static WebElement searchBtn;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement viewShoppingCartOption;
	
	public HeaderSection() {
		PageFactory.initElements(Base.driver, this);
	}
	
	public static void navigateToLoginPage() {
		 Elements.click(myAccountLink);
		   Elements.click(Login);
	}
	
	public static void searchProduct(String productName) {
		Elements.TypeText(searchBoxField, productName);
		Elements.click(searchBtn);
	}
	
	public static void searchProduct() {
		Elements.TypeText(searchBoxField, Base.reader.getProductName());
		Elements.click(searchBtn);
	}
	
	public static void navigateToShoppingCartPage() {
		Elements.click(viewShoppingCartOption);
	}
}
