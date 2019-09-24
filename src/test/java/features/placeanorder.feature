Feature: Place an order
  @smk
  Scenario: Verify successfull placement of any order

    Given User is on Homepage of the application
    When User navigates to login page
    When User fills registration details
    Then Verify registered user on homepage

    When User selects "Printed Summer Dress" from homepage
    Then Verify selected product on the product detail page
    When User adds item to the cart from product detail page
    Then Verify "Printed Summer Dress" product on cart page
    When User proceeds to checkout from Cart page
    When User verifies product details on Order page
    Then Verify order confirmation details on order confirmation page


