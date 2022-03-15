package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.MyAccountPage;
import com.tutorialsninja.automation.pages.SearchResultPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
    HeaderSection headerSection = new HeaderSection();
	MyAccountPage myAccountPage = new MyAccountPage();
	SearchResultPage searchPage = new SearchResultPage();
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String productName){
         HeaderSection.searchProduct(productName); 	   
	}

	@Then("^I should see the product in the search resultsil address$")
	public void i_should_see_the_product_in_the_search_resultsil_address(){
	  // Assert.assertEquals(Elements.getText(SearchResultPage.samsungSyncMarsterSearchResult), "Samsung SyncMaster 941BW");
	}
	
	@Then("^I should see \"([^\"]*)\" message$")
	public void i_should_see_message(String msg) {
	  //Assert.assertEquals(Elements.getText(SearchResultPage.noProductFound), "There is no product that matches the search criteria.");
	}

}
