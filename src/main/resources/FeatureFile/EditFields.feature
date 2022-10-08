Feature: Edit Fields Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    And User should login successfully
    Then User navigate to fields section


  Scenario Outline: Edit Fields
    And User should edit the fields "<name>" and "<code>"
    Then Success message should be displayed

    Examples:
      | name          | code |
      | UpdateFrank   | UFR1  |
      | UpdateFrank2  | UFR2  |


