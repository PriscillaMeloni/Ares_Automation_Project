@B28G7-253 @regression
Feature: Default

		#@B28G7-246
  Background: For all scenarios, user is logged into the Twilia
    Given User is logged on the Twilia page


	#*User Story:* As a Point of Sale manager (POS), I should be able to view product order.
	#
	#*AC:* Verify the POS managers can view the order list on the Point of Sale page, after checking the Order reference,
	#all the check boxes in the order should be checked.
  @B28G7-245
  Scenario: US05AC01TC01-As a POS manager, I should be able to check all the boxes.
    When user logs in as a sales manager
    Then user clicks on Point of Sale tab
    And user clicks on Orders tab
    And user clicks on Order Ref Checkbox
    Then all orders are checked

	#*User Story:* As a POS manager, I should see a  three options 
	#
	#*AC:* Verify the Action drop down has Delete, Import and Export dropdown option
  @B28G7-247
  Scenario: US05AC02TC01- As a POS manager, I should see three options from Action dropdown
    When user logs in as a sales manager
    Then user clicks on Point of Sale tab
    And user clicks on Orders tab
    And user clicks on Order Ref Checkbox
    Then user clicks on Action dropdown button
    Then  user has to verify the action button has three options
      |Import|
      |Export|
      |Delete|


