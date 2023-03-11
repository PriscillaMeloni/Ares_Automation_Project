@smoke
Feature: smoke

  Scenario: POS Manager access Sales module
    Given user is already logged in as a POSManager
    Then user should click on Sales module

  Scenario: Sales Manager access Sales module
    Given user is already logged in as a SalesManager
    Then user should click on Sales module

  Scenario: Sales manager can access 19 different modules
    Given user is on the TwilliaERP sales manager homepage
    Then user can see nineteenth different modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | CRM             |
      | Sales           |
      | Website         |
      | Point of Sale   |
      | Purchases       |
      | Inventory       |
      | Repairs         |
      | Invoicing       |
      | Email Marketing |
      | Events          |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Maintenance     |
      | Dashboards      |


  Scenario: POS manager can access the main module
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

  Scenario: Expenses managers access to 12 modules.
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
