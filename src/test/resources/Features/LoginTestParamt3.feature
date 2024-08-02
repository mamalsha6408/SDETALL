Feature: test login functionality

 Scenario Outline: Check login is successful with valid credentials

    Given browser is open t3
    And user is on login page t3
    When user enter <username> and <password> t3
    And user click login button t3
    Then user is navigated to home page t3

   Examples:
   |username  |password     |
   |student   |Password123  |
   |student   |Password123  |