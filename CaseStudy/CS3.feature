Feature: Search Engine
Scenario: Search for head phones
Given The TestMeApp is open
When The user enters Lalitha as username and Password123 as password
Then The user logins
Then the user searches headphones as search item
Then the user clicks on Find Details
