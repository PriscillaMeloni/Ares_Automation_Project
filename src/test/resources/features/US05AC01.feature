Feature: View product order
  Agile Story: As a Point of Sale manager (POS), I should be able to view product order.

  Background: For all scenarios, user is logged into the Twilia
    Given User is logged on the Twilia page


@sc1
Scenario: 1.Verify the POS managers can view the order list on the Point of Sale page, after checking the Order reference,
            all the check boxes in the order should be checked.
    When user logs in as a sales manager
    Then user clicks on Point of Sale tab
    And user clicks on Orders tab
    And user clicks on Order Ref Checkbox
    Then all orders are checked


Scenario: 2.Verify the Action drop down has Delete button
    When user logs in as a sales manager
    Then user clicks on Point of Sale tab
    And user clicks on Orders tab
    And user clicks on Order Ref Checkbox
    Then user clicks on Action dropdown button
    Then dropdown has Delete Button


  Scenario: 3.Verify the Action drop down has Export button
    When user logs in as a sales manager
    Then user clicks on Point of Sale tab
    And user clicks on Orders tab
    And user clicks on Order Ref Checkbox
    Then user clicks on Action dropdown button
    And dropdown has Export Button


  Scenario: 4.Verify the Action drop down has Import button
    When user logs in as a sales manager
    Then user clicks on Point of Sale tab
    And user clicks on Orders tab
    And user clicks on Order Ref Checkbox
    Then user clicks on Action dropdown button
    And dropdown has Import Button