Feature: Default

    #US11: As a  POS  & Sales Manager, I want to get a repair order on the "Repairs" page.
    #AC1: Verify user can select all the repair orders by clicking the top checkbox.

    Scenario: US11AC01TC01- POS & Sales manager can access Repair Orders
        Given user is already logged in as "POSManager"
        When "POS Manager" clicks on Repairs
        And once clicked Repair Reference checkbox
        Then all repair orders are checked as well