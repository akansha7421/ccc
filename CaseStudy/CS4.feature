Feature: Add to cart
Scenario: User moves to cart without adding any item in it
Given ALex has opened TestMeApp
When Alex search for particular project
And try to proceed to payment without adding any item in the cart
Then Testme doesnt display the cart icon