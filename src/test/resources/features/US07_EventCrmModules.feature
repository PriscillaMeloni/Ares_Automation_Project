@regression

  @B28G7-233
  Feature:
    As an Event manager,  I want to access to the different modules.


  @B28G7-232
  Scenario: US07AC01TC1_Verify Event Manager Can Access the 15 modules

    Given the event manager logged into the system
    And the event manager should see 15 modules options
    When the event manager clicks the module options
    Then actual titles should contain expected words below:

      | #Inbox        |
      | Meetings      |
      | Notes         |
      | Contacts      |
      | Pipeline      |
      | Quotations    |
      | Dashboard     |
      | Inventory     |
      | Repair Order  |
      | Events        |
      | Employees     |
      | Leaves        |
      | Expenses      |
      | Maintenance   |
      | Dashboard     |










