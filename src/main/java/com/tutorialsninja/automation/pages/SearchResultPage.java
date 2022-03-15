package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class SearchResultPage {
	
	@FindBy(linkText="Samsung SyncMaster 941BW")
	public static WebElement samsungSyncMarsterSearchResult;
	
	@FindBy(css="input[id='button-search']+h2+p")
	public static WebElement noProductFound;
	
	@FindBy(xpath="//span[text()='Add to Cart'][1]")
	public static WebElement firstAddToCartOption;
	
	public SearchResultPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	public static void addFirstProductInSearchResultCart() {
		Elements.click(firstAddToCartOption);
	}

}