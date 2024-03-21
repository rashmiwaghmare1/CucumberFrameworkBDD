Feature: Customer

  Scenario: Add new Customer
    Given User lauch chrome browser
    When User open Url "https://admin-demo.nopcommerce.com/login"
    And User Enter email"admin@yourstore.com"
    And Enter password"admin"
    And Click on login
    Then Page title should be"Dashboard / nopCommerce administration"
    When User click on Customers menu
    And User click on Customers
    And USer click on Add new button
    Then User can view Add a new customer Page
    When User enter Customer info
    And User click on save button
    Then User should get confirmation message
    And Close browser

  Scenario: Search By email
    Given User lauch chrome browser
    When User open Url "https://admin-demo.nopcommerce.com/login"
    And User Enter email"admin@yourstore.com"
    And Enter password"admin"
    And Click on login
    Then Page title should be"Dashboard / nopCommerce administration"
    When User click on Customers menu
    And User click on Customers
    Then User can view Customers Page
    When User enter email
    And click on search button
    Then User found data available in table
    And close browser
