@B28G7-256 @regression
Feature: Default



  @B28G7-239
  Scenario: US08AC01TC01 Verify the Expenses managers access to 12 modules.
    Given User logged in as ExpensesManager
    Then User can see twelve different modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | Website         |
      | Events          |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Lunch           |
      | Maintenance     |
      | Dashboards      |

    Then User click on each modules and can access to the following page titles
      |#inbox               |
      | Meetings            |
      | Notes               |
      | Contacts            |
      | Website             |
      | Events              |
      | Employees           |
      |Leaves Summary       |
      |My Expenses to Submit|
      |New Order - Odoo     |
      |Maintenance Teams    |
      |My Dashboard         |

















    
    
    
    
    
