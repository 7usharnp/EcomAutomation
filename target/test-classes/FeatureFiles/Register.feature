Feature: Registration functionality scenarios

@Register
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | Tushar                     |
      | LastName  | Nangare-Patil              |
      | Email     | tusharnangre5446@gmail.com |
      | Telephone |                 8380802646 |
      | Password  | tushar1234                 |
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created

  Scenario: Verify whether the user is allowed or not to register on skipping mandatory fields
    Given I launch the application
    And I navigate to Account Registration page
    And I click on Continue button
    Then I should see that the user Account is not created
    And I should see error message informing the user to fill the mandatory fields

  @Register
  Scenario: Verify whether the user is able to register into application by opting for Newsletter subscription
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | Tushar                     |
      | LastName  | Nangare-Patil              |
      | Email     | tusharnangre5446@gmail.com |
      | Telephone |                 8380802646 |
      | Password  | tushar1234                 |
    And I select the Privacy Policy
    And I subscribe to newsletter
    And I click on Continue button
   Then I should see that the User Account has successfully created

   
   Scenario: Verify whether the user is restricted from creating a duplicate account
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | Tushar                     |
      | LastName  | Nangare-Patil              |
      | Email     | tusharnangre5446@gmail.com |
      | Telephone |                 8380802646 |
      | Password  | tushar1234                 |
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see user is restricted from creating duplicate account