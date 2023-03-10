
@regression
Feature: Default


		#@B28G7-229
  Background: user is on the login page of the TwilliaERP login page
    Given user is on the TwilliaERP sales manager homepage

	#_*User Story:*_
	# * As a sales manager, I should be able to access to the different modules.
	#
	#_*Acceptance Criteria:*_
	# * Verify the sales managers access to 19 modules. 
  @B28G7-221
  Scenario: US09AC01TC01 - Verify, sales manager can access 19 different modules



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

    Then user clicks on each modules options and verifies url contains part of the URL

		      #| channel_inbox |
      | channel_inbox |
      | calendar      |
      | note.note     |
      | res.partner   |
      | crm.lead      |
      | sale.order    |
      | web           |
      | pos.config    |
      | purchase      |
      | stock         |
      | repair        |
      | invoice       |
      | mailing       |
      | event.event   |
      | hr.employee   |
      | hr.holidays   |
      | hr.expense    |
      | maintenance   |
      | board.board   |