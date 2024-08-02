Feature: feature to test google search functionality

  Scenario: Validate google search is working

    Given browser is open t1
    And user is open google search page t1
    When user enters a text in searchbox t1
    And hits enter t1
    Then user navigate to result page t1