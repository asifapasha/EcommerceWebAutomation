Feature: Place an order

  @smk
  Scenario: Verify successful placement of any order

    Given User is on Homepage of the application
    When User navigates to login page
    When User fills registration details
    Then Verify registered user on homepage

    When User selects "Printed Summer Dress" from homepage
    Then Verify selected product on the product detail page
    When User adds item to the cart from product detail page
    Then Verify "Printed Summer Dress" product on cart page
    When User proceeds to checkout from Cart page

    Then User verifies product details on Summary page
    When User clicks on proceed to checkout button on Summary page

    Then Verify "Billing Address" address on Address confirmation page
    Then User clicks on proceed to checkout button on Address confirmation page

    Then Verify terms of service on Shipping page
    And  User click on agree button on Shipping page
    And  User click on proceed to checkout on Shipping page

    And  Verify product details on Payment page
    When select "Pay by check" as payment method on Payment page
    Then Verify selected payment method on payment page

    When User clicks on confirm my order button on payment page
    Then Verify order details on order confirmation page


