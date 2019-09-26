package com.automation.steps;

import com.automation.pages.ShippingPage;
import cucumber.api.java.en.Then;

public class ShippingPageSteps {
    ShippingPage shipingpage = new ShippingPage();

    @Then("^Verify terms of service on Shipping page$")
    public void verify_terms_of_service_on_Shipping_page(){
        shipingpage.verifyServiceTermsOnshippingPage();
    }
    @Then("^User click on agree button on Shipping page$")
    public void user_click_on_agree_button_on_Shipping_page(){
        shipingpage.clickOncheckBox();
    }
    @Then("^User click on proceed to checkout on Shipping page$")
    public void user_click_on_proceed_to_checkout_on_Shipping_page(){
         shipingpage.clickOnProceedToCheckOutbutton();

    }
}
