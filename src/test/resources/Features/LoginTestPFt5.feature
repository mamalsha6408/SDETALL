Feature: test login functionality

 Scenario Outline: Check login is successful with valid credentials

    Given browser is open t5
    And user is on login page t5
    When user enter <username> and <password> t5
    And user click login button t5
    Then user is navigated to home page t5

   Examples:
   |username  |password     |
   |student   |Password123  |
   |student   |Password123  |