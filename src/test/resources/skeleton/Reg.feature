Feature: Register
 
 
 
Scenario Outline: Successful Register
 
Given The SignUp page is opened
 
When the "<username>" , "<firstname>" , "<lastname>" , "<password>" , "<confirm_password>" , "<e_mail>" , "<mob>" , "<address>"  and the other details are given
 
Then The user is regestered 
 
 
 
Examples:
 
|username |firstname|lastname|password|confirm_password|e_mail          |mob       |address|
 
|Amala |Aishu     |Dipa    |drdrdrdr|drdrdrdr         |vdhpri@gmail.com|7708837882|Kodambakkaammmmm    |
