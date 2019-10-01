Feature: Login with multiple username
Scenario Outline: Enter Valid Credentials
Given The application page is open
When User clicks SignIn link
And The user enters "<username>" and "<password>"
Then Message displays Login Successful
Examples:
|username|password|
|Lalitha|Password123|
|Anki12345|qwerty|
|AlexUser|AlexUser@123|