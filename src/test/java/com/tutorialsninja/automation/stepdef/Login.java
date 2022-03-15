package com.tutorialsninja.automation.stepdef;

import org.eclipse.jetty.util.log.Log;
import org.testng.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	HeaderSection headerSection = new HeaderSection();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

	@And("^I navigate to login page$")
	public void i_navigate_to_login_page() {
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.Login);
	}

	@When("^I Login to application using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_login_to_application_using_username_something_and_password_something(String uname, String pwd) {
		LoginPage.doLogin(uname, pwd);
	}

	@Then("^I should see that user is able to login successfully$")
	public void i_should_see_that_user_is_able_to_login_successfully() {
		Assert.assertEquals(Elements.getText(HeaderSection.accountLink), "Account");
	}

	@Then("^I should see validation message for incorrect credentials$")
	public void i_should_see_validation_message_for_incorrect_credentials() {
		Assert.assertEquals(Elements.getText(LoginPage.validationMsg),
				"Warning: No match for E-Mail Address and/or Password.");
		// Elements.VerifyTextEquals(element, expected)
	}

	
	
	@When("^I reset the forgotten password for email \"([^\"]*)\"$")
	public void i_reset_the_forgotten_password_for_email(String email) {
		Elements.click(LoginPage.forgotPasswordLink);
		ForgotPasswordPage.fillForgotPasswordForm(email);
	}

	@Then("^I should see a message informing the user that information related to resetting password have been sent to email address$")
	public void i_should_see_a_message_informing_the_user_that_information_related_to_resetting_password_have_been_sent_to_email_address() {
		Assert.assertEquals(Elements.getText(LoginPage.forgotpasswordValidationLink), "An email with a confirmation link has been sent your email address.");
		
	}
	
	
}
