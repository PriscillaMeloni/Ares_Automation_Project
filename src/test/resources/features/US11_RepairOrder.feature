Feature: Default

    #US11: As a  POS  & Sales Manager, I want to get a repair order on the "Repairs" page.
    #AC1: Verify user can select all the repair orders by clicking the top checkbox.

    #US11AC01TC01
    Scenario: POS & Sales manager can access Repair Orders
        Given user is already logged in as POSManager
        When POS Manager clicks on Repairs
        And once clicked Repair Reference checkbox
        Then all repair orders are checked as well

        #US11AC01TC02
        Given user is already logged in as SalesManager
        When Sales Manager clicks on Repairs
        And once clicked Repair Reference checkbox
        Then all repair orders are checked as well