
@tag
Feature: Purchase the order from Ecommerce Website
	I want to use this template for my feature file

Background: 
Given I landed on Ecommerce page
 
  Scenario Outline: Positive test of submitting the order
    Given Logged in with username <username> and password <password>
    When I add product <productName> to cart
    And Checkout product <productName> and submit the order
    Then "THANK YOU FOR THE ORDER." message is displayed on Confirmation page

    Examples: 
      | username  								| password 	| productName |
      | umohanbabu123@gmail.com 	| Mohan@107	| ZARA COAT 3 |
    