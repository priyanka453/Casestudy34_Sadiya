Feature: Scenario Outline Login Page
Scenario Outline: Login Credentials

Given user not logged in
When user performs login using "<username>" and "<password>"
Then Logged in successfully

Examples:
|username||password|
|lalitha||Password123|