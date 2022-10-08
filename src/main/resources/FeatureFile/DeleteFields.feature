Feature: Delete Fields Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    And User should login successfully
    Then User navigate to fields section


  Scenario Outline: Delete Fields
    And User should delete the fields "<name>"
    Then Success message should be displayed

    Examples:
      | name          |
      | UpdateFrank   |
      | UpdateFrank2  |