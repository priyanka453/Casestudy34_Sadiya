Feature: Search Engine User Story

@ValidSearch
Scenario: Valid Search
Given user should be in Search Page
When user search for the product by entering "head", add to cart and proceed to payment
Then user gets the order confirmation 

@InvalidSearch
Scenario: Invalid Search 
Given user should be in search page
When  user searches for the invalid product as "abc"
Then user gets notifies about the invalid product

@NoPurchase
Scenario: No Purchase
Given user is already registered in testme
When user searches for the product by entering "head" but doesnot add to cart
Then user tries to display the cart and finds no item in cart

