@B28G7-231
Feature: Default
  #Ac: Verify users can select all the quotations by clicking the top checkbox.
  @B28G7-222 @sales
  Scenario: US10AC01TC01-Manager access and click on "Quotations" in Sales module
    Given user is already logged in as a POSManager
    Then user should click on Sales module
    And user can click on main Quotation Box
    Then user should see all the checkboxes are selected
  @B28G7-234
  Scenario: US10AC01TC02-Manager access and click on "Quotations" in Sales module
    Given user is already logged in as a SalesManager
    Then user should click on Sales module
    And user can click on main Quotation Box
    Then user should see all the checkboxes are selected