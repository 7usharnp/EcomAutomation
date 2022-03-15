package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Order {
	HeaderSection headerSection = new HeaderSection();
	LoginPage loginPage= new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	SearchResultPage searchResultPage = new SearchResultPage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	CheckoutPage checkoutPage = new CheckoutPage();
	OrderSuccessPage orderSuccessPage = new OrderSuccessPage();
	
	@Given("^I login to the application$")
	public void i_login_to_the_application()  {
	   Browser.openApplicationUrl();
	   HeaderSection.navigateToLoginPage();
	   LoginPage.doLogin();	   
	}

	@When("^I add any product to Bag and checkout$")
	public void i_add_any_product_to_Bag_and_checkout()  {
	   HeaderSection.searchProduct();
	   SearchResultPage.addFirstProductInSearchResultCart();
       HeaderSection.navigateToShoppingCartPage();
       ShoppingCartPage.ClickcheckOutBtn();
       
	}

	@And("^I place an order$")
	public void i_place_an_order()  {
		CheckoutPage.placeAnOrder();
	}

	@Then("^I should see that the order is placed successfully$")
	public void i_should_see_that_the_order_is_placed_successfully()  {
	  Assert.assertTrue( Elements.isDisplayed(OrderSuccessPage.succuessBreadcrumb));
	}

}
