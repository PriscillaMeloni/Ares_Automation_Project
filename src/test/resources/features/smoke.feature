@smoke
Feature: smoke

  Scenario: POS Manager access Sales module
    Given user is already logged in as a POSManager
    Then user should click on Sales module

  Scenario: Sales Manager access Sales module
    Given user is already logged in as a SalesManager
    Then user should click on Sales module