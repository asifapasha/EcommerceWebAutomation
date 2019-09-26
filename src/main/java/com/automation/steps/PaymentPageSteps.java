package com.automation.steps;

import com.automation.pages.PaymentPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentPageSteps {
    PaymentPage paymentPage = new PaymentPage();

    @Then("^Verify product details on Payment page$")
    public void verify_product_details_on_Payment_page() {
        paymentPage.verifyTheproductdetailsOnPaymentPage();
    }

    @When("^select \"([^\"]*)\" as payment method on Payment page$")
    public void select_as_payment_method_on_Payment_page(String arg1) {
        paymentPage.clickOnPaymentMethod();
    }

    @Then("^Verify selected payment method on payment page$")
    public void verify_selected_payment_method_on_payment_page() {

    }

    @When("^User clicks on confirm my order button on payment page$")
    public void user_clicks_on_confirm_my_order_on_payment_page() {
        paymentPage.clickOnConfirmMyorder();
    }
}
