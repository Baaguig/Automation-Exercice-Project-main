
Feature: User Registration and Deletion
  As a user I want to register a new account and then delete it

  @registerUser_deleteUser
  Scenario: Register a new user and delete the account
    Given the browser is launched on the homepage
    And the home page is visible
    When I click on the Signup/Login button
    When I enter a name and email address
    And I click the Signup button
    When I select the title Mr
    And I insert the password
    And I select the date of birth
    And I select the Sign up for our newsletter! checkbox
    And I select the Receive special offers from our partners! checkbox
    And I fill in the address details:
      | First name   | John          |
      | Last name    | Doe           |
      | Company      | OpenAI        |
      | Address      | 123 Main St   |
      | Address2     | Apt 4B        |
      | State        | California    |
      | City         | San Francisco |
      | Zipcode      | 94105         |
      | Mobile Number| +1234567890   |
      And I select a random country
      And I Click on create account button
      Then I verify "ACCOUNT CREATED!" is visible 
      And I click the Continue button in account_created page 
      And I I click the delete Account button
      And I Verify that "Account Deleted!" is shown in green 
      And I click the Continue button in account_deleted page
      
      
      
      
      
      
