Feature: Add New Fields Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    And User should login successfully
    Then User navigate to fields section


  Scenario Outline: Add New Fields
    And User create a new fields "<name>" and "<code>" and "<fieldType>" "<Key>" "<Value>"
    Then Success message should be displayed

    Examples:
      | name    | code | fieldType           | Key | Value | Child field |
      | Frank   | FR1  | List Of Value       | qwert     |  asdf  |       |
      | Frank2  | FR2  | Number              |  none    |   none  |         |




