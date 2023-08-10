Feature: Fee Functionality

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to Fees page

  @Smoke
  Scenario: Create a Fee
    And Click on add button
    And Fill the add fee form
      | Group6El Fee |
      | g6          |
      | gr6         |
      | 5040          |
    When Click on save button
    Then Success message should be displayed

    # TODO Create a scenario to delete all fees created in the first scenario
    # TODO Use Data Table