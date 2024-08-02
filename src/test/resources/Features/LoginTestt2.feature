Feature: test login functionality

  Scenario: Check login is successful with valid credentials

    Given browser is open t2
    And user is on login page t2
    When user enter username and password t2
    And user click login button t2
    Then user is navigated to home page t2