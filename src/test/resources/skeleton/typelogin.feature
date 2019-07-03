Feature: Login

Background: 
Given User is on login page

Scenario: Successful Login

When user enters valid credentials and clicks on login button
Then user does successful login

Scenario: Unsuccessful Login

When user enters invalid credentials and clicks on login button
Then error page is loaded 