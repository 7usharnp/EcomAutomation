Feature: Login Functionality Feature


  Scenario: Verify whether the user is able to login with valid credentials
    Given I launch the application
    And I navigate to login page
    When I Login to application using username "tusharnangre5446@gmail.com" and password "tushar1234"
    Then I should see that user is able to login successfully

  Scenario: Verify whether user is able to login with invalid credentials
    Given I launch the application
    And I navigate to login page
    When I Login to application using username "tusharnangre5446@gmail.com" and password "tushartest"
    Then I should see validation message for incorrect credentials

 
  Scenario: Verify whether user is able to login without providing credentials
    Given I launch the application
    And I navigate to login page
    When I Login to application using username "" and password ""
    Then I should see validation message for incorrect credentials

 
    Scenario: Verify whether user is able to reset the forgotten password
     Given I launch the application
    And I navigate to login page
    When I reset the forgotten password for email "tusharnangre5446@gmail.com"
    Then I should see a message informing the user that information related to resetting password have been sent to email address
    