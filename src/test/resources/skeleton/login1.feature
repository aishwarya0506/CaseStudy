
Feature:mercury
 
 
Scenario Outline: successful login
 
Given user enters Login Page
 
When User enters valid "<username>" and "<password>"
 
Then successful login

 
Examples:
 
 |username|password|
 |AlexUser|Alex@123|
