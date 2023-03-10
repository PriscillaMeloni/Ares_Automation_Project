@B28G7-238 @regression
Feature: Default


  @B28G7-225
  Scenario: US02AC01TC01 - Verify sales manager can access the "Repairs" page and see 6 columns displayed
    Given the user logged in as Sales Manager
    When the user navigates to Repairs module and clicks
    Then the user should be able to see 6 following column options
      | Repair Reference    |
      | Product to Repair   |
      | Customer            |
      | Delivery Address    |
      | Warranty Expiration |
      | Status              |


  @B28G7-226
  Scenario: US02AC01TC02 - Verify POS manager can access the "Repairs" page and see 6 columns displayed
    Given the user logged in as POS Manager
    When the user navigates to Repairs module and clicks
    Then the user should be able to see 6 following column options

      | Repair Reference    |
      | Product to Repair   |
      | Customer            |
      | Delivery Address    |
      | Warranty Expiration |
      | Status              |