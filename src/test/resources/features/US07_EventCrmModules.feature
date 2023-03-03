Feature: As an Event manager,  I want to access to the different modules.


  Scenario Outline: Verify the Event managers access to 15 modules.
    Given the user is on the page
    When the user clicks to "<module>" module
    Then user sees the "<expectedTitle> is the title


    Examples:
      | module   | expectedTitle   |
      | Discuss  | #Inbox - Odoo   |
      | Calendar | Meetings - Odoo |

