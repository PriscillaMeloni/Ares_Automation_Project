Feature: Default

	#US:
	#
	#As a POS manager I should be able to access the main module
  @B28G7-228 @regression
  Scenario: US03AC01TC01 -Verify the POS manager can access the main module
    Given POS manager is on the login page page.
    When POS enters username and password and login.
    Then  POS manager clicks on each module.
      | #Inbox        |
      | Meetings      |
      | Notes         |
      | Contacts      |
      | Pipeline      |
      | Quotations    |
      | Dashboard     |
      | Point         |
      | Requests      |
      | Inventory     |
      | Manufacturing |
      | Repair        |
      | Projects      |
      | Events        |
      | Surveys       |
      | Employees     |
      | Attendance    |
      | All Leaves    |
      | My Expenses   |
      | Maintenance   |
      | Vehicles      |
      | Dashboard     |