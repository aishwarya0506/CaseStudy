Feature: Calculator 

  Scenario outline: Add two numbers <input1> and <input2>
    Given I have a calculator
    When I add <input1> and <input2>
    Then The result should be <total>
   
Examples :
	 |input1|input2|total|
   |10    |20    |30   |
   |20    |30    |50   |
   |30    |40    |70   |
  