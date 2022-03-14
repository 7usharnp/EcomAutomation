package com.tutorialsninja.automation.stepdef;

import org.testng.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.MyAccountPage;
import com.tutorialsninja.automation.pages.SearchPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {

	MyAccountPage myAccountPage = new MyAccountPage();
	SearchPage searchPage = new SearchPage();
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String productName){
         MyAccountPage.searchProduct(productName); 	   
	}

	@Then("^I should see the product in the search resultsil address$")
	public void i_should_see_the_product_in_the_search_resultsil_address(){
	   Assert.assertEquals(Elements.getText(SearchPage.samsungSyncMarsterSearchResult), "Samsung SyncMaster 941BW");
	}
	
	@Then("^I should see \"([^\"]*)\" message$")
	public void i_should_see_message(String msg) {
	  Assert.assertEquals(Elements.getText(SearchPage.noProductFound), "There is no product that matches the search criteria.");
	}

}
