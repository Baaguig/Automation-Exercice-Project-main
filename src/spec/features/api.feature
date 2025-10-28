
Feature: API Testing with ReqRes

  Scenario: Verify users API returns valid response
    When I send a GET request to "https://reqres.in/api/users?page=2"
    Then the response status code should be 200
    And the response should contain the key "data"
