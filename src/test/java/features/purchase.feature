Feature: Purchase

  Scenario: Complete a purchase
    Given user is successfully authenticated
    When user adds items to the shopping cart
    And user sees the items added in the shopping cart
    And user proceed to checkout
    And user fill the personal information
    And user review the order
    Then user should be redirected to the confirmation page