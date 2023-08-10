Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on Login Button
    And Navigate to Citizenship page


  Scenario Outline: Create a Citizenship
    And Click on add button
    Then Enter "<CitizenshipName>" as citizenship name and "<CitizenshipShortName>" as short name
    When Click on save button
    Then Success message should be displayed
    Examples: Data for Create a Citizenship scenario
      |CitizenshipName|CitizenshipShortName|
      |LELA1           |U1                  |
      |LELA2           |U2                  |
      |LELA3           |U3                  |
      |LELA4           |U4                  |

    #TODO: Create Delete Citizenship scenario by using Scenario Outline and delete the citizenships you created in the first scenario

  Scenario Outline: Delete a Citizenship
    And Search for the citizenship with the name "<CitizenshipName>" and shortname "<CitizenshipShortName>"
    When Delete citizenship
    Then Success message should be displayed
    Examples: Data for Delete Citizenship scenario
      |CitizenshipName|CitizenshipShortName|
      |LELA1           |U1                  |
      |LELA2           |U2                  |
      |LELA3           |U3                  |
      |LELA4           |U4                  |
