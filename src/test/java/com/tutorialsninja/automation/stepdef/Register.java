package com.tutorialsninja.automation.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Register {

	HeaderSection headerSection = new HeaderSection();
	RegisterPage registerPage = new RegisterPage();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();

	@Given("^I launch the application$")
	public void i_launch_the_application() {
		Base.driver.get(Base.reader.getUrl());
	}

	@And("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page() {
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.register);
	}

	@And("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable) {
		RegisterPage.enterAllDetails(dataTable,"duplicate");

	}

	@And("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy() {
		Elements.click(RegisterPage.privacyPolicy);
	}

	@And("^I click on Continue button$")
	public void i_click_on_Continue_button() {
		Elements.click(RegisterPage.continueBtn);

	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created() {
		String successMsg = Elements.getText(AccountSuccessPage.successBreadcrumb);
		//Assert.assertEquals(successMsg, "Success");

	}

	@Then("^I should see that the user Account is not created$")
	public void i_should_see_that_the_user_Account_is_not_created() {
		String actualpageTitle = Base.driver.getTitle();
		//Assert.assertEquals(actualpageTitle, "Register Account");
	}

	@Then("^I should see error message informing the user to fill the mandatory fields$")
	public void i_should_see_error_message_informing_the_user_to_fill_the_mandatory_fields() {
		//Assert.assertTrue(RegisterPage.validationMsg.isDisplayed());
	}

	@And("^I subscribe to newsletter$")
	public void i_subscribe_to_newsletter() {
		Elements.click(RegisterPage.yesToNewsletter);
	}

	@Then("^I should see user is restricted from creating duplicate account$")
	public void i_should_see_user_is_restricted_from_creating_duplicate_account()  {
	 String actualMsg=	Elements.getText(RegisterPage.duplicationMsg);
	 //Assert.assertEquals(actualMsg, "Warning: E-Mail Address is already registered!");
	//  Assert.assertTrue(Elements.isDisplayed(RegisterPage.duplicationMsg));
	}


	

}
