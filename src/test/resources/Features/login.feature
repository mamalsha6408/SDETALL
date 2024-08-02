Feature: To test user login module

  Scenario: Test user login module with valid credentials

    Given user in login page
    And user enter username and password
    When user click login button
    Then user navigate to home page