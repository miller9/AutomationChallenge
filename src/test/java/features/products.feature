Feature: Products page
  As a user I want to visualize and sort products

  Scenario: Sort products by price low to high
    Given user is successfully authenticated
    When user sort products by low to high price
    Then user sees the products organized by price from lowest to highest
