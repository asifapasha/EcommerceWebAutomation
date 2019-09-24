package com.automation.steps;

import com.automation.pages.CartPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartPageSteps {
   CartPage cartpage = new CartPage();

    @Then("^Verify \"([^\"]*)\" product on cart page$")
    public void verifyProductOnCartPage(String productName) {
        cartpage.verifyAddedProductToCartPage(productName);
    }


    @When("^User proceeds to checkout from Cart page$")
    public void user_proceeds_to_checkout_from_Order_page(){
        cartpage.clickOnProceedToCheckoutbutton();
    }
}
