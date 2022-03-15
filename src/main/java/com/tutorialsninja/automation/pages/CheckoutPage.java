package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	
	@FindBy(id = "button-payment-address")
	public static WebElement continueBtnOfBillingDetailSection;
	
	@FindBy(id="button-shipping-address")
	public static WebElement continueBtnOfDeliveryDetailsSection;

	@FindBy(id="button-shipping-method")
	public static WebElement continueBtnOfDelivaryMethodSection;
	
	@FindBy(name="agree")
	public static WebElement termAndConditionsCheckbox;

	@FindBy(id="button-payment-method")
	public static WebElement continueBtnOfPaymentMethodSection;

	@FindBy(id="button-confirm")
	public static WebElement confirmOrderBtn;

	
	public CheckoutPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	public static void placeAnOrder() {
		Elements.click(continueBtnOfBillingDetailSection);
		Elements.click(continueBtnOfDeliveryDetailsSection);
		Elements.click(continueBtnOfDelivaryMethodSection);
		Elements.click(termAndConditionsCheckbox);
		Elements.click(continueBtnOfPaymentMethodSection);
		Elements.click(confirmOrderBtn);

	}

}
