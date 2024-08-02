Feature: test login functionality

 Scenario Outline: Check login is successful with valid credentials

    Given browser is open t4
    And user is on login page t4
    When user enter <username> and <password> t4
    And user click login button t4
    Then user is navigated to home page t4

   Examples:
   |username  |password     |
   |student   |Password123  |
   |student   |Password123  |