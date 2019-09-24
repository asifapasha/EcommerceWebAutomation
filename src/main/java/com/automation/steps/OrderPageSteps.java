package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.pages.OrderPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderPageSteps {
    OrderPage orderpage = new OrderPage();

    @When("^User verifies product details on Order page$")
    public void user_verifies_product_details_on_Order_page(){
        orderpage.verifyOrderedProductDetail();
    }

}
