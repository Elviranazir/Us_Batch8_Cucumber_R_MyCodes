Feature: Entrance Exams Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button

  Scenario Outline: Create an Entrance exam
    And Go to Entrance Exams page
    And Click on add button
    And Fill the Create Exam form with
    |<Exam Name>|
    And Create a description
    |<Description>|
    And create a note
    |<Note>|
    When Click on save button
    Then Success message should be displayed
    Examples: Data for Create Entrance Exam Scenario
      | Exam Name      | Description           | Note                             |
      | Batch 8 Group 1 | Batch 8 is the best   | We are coming to the market soon |
      | Batch 8 Group 2 | Batch 8 rocks         | Get prepared                     |
      | Batch 8 Group 3 | Batch 8 don't give up | We can do it                     |
      | Batch 8 Group 4 | We are almost ready   | We will be better than anyone    |




