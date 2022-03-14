package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:FeatureFiles/" }, glue = {
		"classpath:com.tutorialsninja.automation.stepdef" }, plugin = { "html:target/cucumber-html-report",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml", }, monochrome = true, tags = { "@Two" })
public class Runner {

}
