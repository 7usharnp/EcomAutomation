package com.tutorialsninja.automation.framework;

public class ConfigFileReader {
	public String getReportConfigPath(){
		String reportConfigPath = "E:\\EcommerceApplicationAutomation\\MyEcomProject\\src\\main\\resources\\ConfigurationFile\\config.properties";
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}
