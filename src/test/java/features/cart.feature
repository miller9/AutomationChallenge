Feature: Cart page
  As a user I want to add products to the shopping cart

  Background:
    Given user is successfully authenticated

  Scenario: Add multiple items to the shopping cart
    When user adds items to the shopping cart
    Then user sees the items added in the shopping cart

  Scenario: Add the specific product ‘Sauce Labs Onesie’ to the shopping cart
    When user adds the ‘Sauce Labs Onesie’ product to the shopping cart
    Then user confirms that the correct product was added to the cart