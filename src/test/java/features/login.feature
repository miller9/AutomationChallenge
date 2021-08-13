Feature: Login and logout
  As a user I want to login to the saucedemo page and also I want to log out my account from the application

  Background:
    Given User is on the saucedemo Homepage

  Scenario: Login with a valid user
    When type username on the username field
    And type password on the password field
    Then should be redirected to the Products page

  Scenario: Login with an invalid user
    When type wrong username on the username field
    And type right password on the password field
    Then the error message should be displayed

  Scenario: Logout from the saucedemo Homepage
    When the user is logged in on the Products page
    And selects the logout option
    Then should be redirected to the Login page