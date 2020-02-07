Feature: Seller
  	As a web user
		I want to use Seller
		to search product


  Scenario Outline: Search Product
    Given that <name> wants to login he entered username <user> and password <pass>
    When he is looking for a product with EAN <ean>
    Then he should see on the page <productname>
    Examples:
      | name   | user                          | pass       |ean             | productname                         |
      | Seller | ccbustamante221@misena.edu.co | Camilo123. |  3993160000001 |Drone Xiaomi + Drone Xiaomi pro      |