

Feature: Product Search Functionality

  As a user,
  I want to search for products on Automation Exercise,
  So that I can verify the search results and product visibility.

  Scenario: Search for a product and validate results
    Given I navigate to Eutomation Exercice Website
    Then the home page should be visible
    When I click on the Products button
    Then I should be navigated to the ALL PRODUCTS page
    When I search for product "T-Shirt"
    Then "SEARCHED PRODUCTS" section should be visible
    And all products related to "T-Shirt" should be displayed