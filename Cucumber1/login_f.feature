Feature: Login action Test
Scenario: Successful Credential with valid Credential
Given The login page is open
When the user enters "Lalitha" as username and "Password123" as password
When The user clicks on Login Button
Then The user will find a TestMeApp Home page