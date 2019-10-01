Feature: Login action Test
Scenario Outline: Successful Credential with valid Credential
Given Open the application
When  User click SignIn link
And the user enters "<username>" and "<password>"
Then Message displayed Login Successfully

Examples:
|username|password|
|Lalitha|Password123|
|admin|pass123|