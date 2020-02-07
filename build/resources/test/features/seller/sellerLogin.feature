Feature: Seller
  	As a web user
		I want to use Seller
		to login


  Scenario Outline: Login
    Given that <name> wants to login
    When he entered username <user> and password <pass>
    Then he should see on the home page <username>
    Examples:
      | name   | user                          | pass       | username                         |
      | Seller | ccbustamante221@misena.edu.co | Camilo123. | la tienda de cristian modificado |