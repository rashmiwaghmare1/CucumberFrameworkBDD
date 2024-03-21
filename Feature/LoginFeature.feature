Feature: Login Functionality

  Scenario: Successful Login with valid Credentials
    Given User lauch chrome browser
    When User open Url "https://admin-demo.nopcommerce.com/login"
    And User Enter email"admin@yourstore.com"
    And Enter password"admin"
    And Click on login
    Then Page title should be"Dashboard / nopCommerce administration"
    When Click on logout link
    Then Page title should be "Your store. Login"
    And Close browser

  Scenario Outline: Successful Login with valid Credentials Dot
    Given User lauch chrome browser
    When User open Url "https://admin-demo.nopcommerce.com/login"
    And User Enter email"<email>"
    And Enter password"<password>"
    And Click on login
    Then Page title should be"Dashboard / nopCommerce administration"
    When Click on logout link
    Then Page title should be "Your store. Login"
    And Close browser

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
      | test@yourstore.com  | admin    |
