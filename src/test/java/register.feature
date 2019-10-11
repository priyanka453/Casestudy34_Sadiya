Feature: Register Page
Scenario: Registration

Given  open browser and sign up in testMe App
When  enter user name to register as "Sadiya"
And user enter first name in registration page as "Shaik"
And user enter last name as "S"
And user enter password as "sadiyayaseen"
And user re enters the password as "sadiyayaseen"
And user selects the gender
And user enter the email id as "sadiya@gmail.com"
And user enters mobile number as "1234567890"
And user enter Date of Birth as "12/01/1997"
And user enters home Address as "Chennai"
And user enter security question as "What is your favour color"
And user enter the Answer as "blue"
Then check if the application login page is displayed
