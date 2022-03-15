Feature: Search functionality feature

  
  Scenario: Verify whether the User is able to search for products
    Given I launch the application
    When I search for a product "Samsung SyncMaster 941BW"
    Then I should see the product in the search resultsil address

  Scenario: Verify whether user is informed when product being searched is not available
    Given I launch the application
    When I search for a product "Apple iphone"
    Then I should see "There is no product that matches the search criteria." message