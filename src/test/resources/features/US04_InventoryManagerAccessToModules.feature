Feature: Default

	#US:
	#
	#As an Inventory manager, I should be able to access to the main modules.
	#
	#AC:
	#
	#Verify the Inventory managers access to 16 modules.
  @B28G7-236
  Scenario: US04AC01TC01
    Given user is on the login page
    Then user enters correct username, password and login
    Then user land on inbox, should see text "Congratulations, your inbox is empty"
    And user able to click all the module
      | Discuss       |
      | Calendar      |
      | Notes         |
      | Contacts      |
      | Website       |
      | Inventory     |
      | Manufacturing |
      | Repairs       |
      | Invoicing     |
      | Timesheets    |
      | Employees     |
      | Leaves        |
      | Expenses      |
      | Lunch         |
      | More          |


