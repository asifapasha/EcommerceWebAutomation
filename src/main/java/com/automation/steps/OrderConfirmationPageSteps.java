package com.automation.steps;

import com.automation.pages.OrderConfirmationPage;
import com.automation.pages.OrderPage;
import cucumber.api.java.en.Then;

public class OrderConfirmationPageSteps {
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();

    @Then("^Verify order details on order confirmation page$")
    public void verifyOrderConfirmationDetails() {
        orderConfirmationPage.getOrderReferenceNumber();
    }
/*    @Then("^Verify order details on order confirmation page$")
    public void verify_order_details_on_order_confirmation_page(){

    }*/


}
