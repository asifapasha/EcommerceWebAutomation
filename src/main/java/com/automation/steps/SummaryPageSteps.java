package com.automation.steps;

import com.automation.pages.SummaryPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SummaryPageSteps {
    SummaryPage summaryPage = new SummaryPage();

    @Then("^User verifies product details on Summary page$")
    public void user_verifies_product_details_on_Summary_page() {
        summaryPage.verifyOrderedProductDetail();
    }

    @When("^User clicks on proceed to checkout button on Summary page$")
    public void user_clicks_on_proceed_to_checkout_button_on_Summary_page() {
        summaryPage.proceedTocheckOut();
    }

}
