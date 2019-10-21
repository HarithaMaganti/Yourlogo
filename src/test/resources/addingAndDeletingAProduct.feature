@ProductSelectionAndRemoval
 Feature: Product selection and removal
  As a registered customer
  I want to search for a product
  So that I can add a product and remove the same

  Scenario: Product selection and removal
    Given I am on Homepage
    When I search for a Product "Dresses" and click on magnifier
    And I see all the related Products
    And I click on product "Printed Chiffon Dress"
    And I click on add to cart
    And I click on Proceed to checkout
    And I can view "SHOPPING-CART SUMMARY" page header
    And I click on "Delete" icon
    Then I can view "(empty)" message



