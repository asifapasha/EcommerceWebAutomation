package com.automation.steps;

import com.automation.pages.ProductDetailsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductDetailsPageSteps {
    ProductDetailsPage productdetailspage = new ProductDetailsPage();

    @Then("^Verify selected product on the product detail page$")
    public void verify_selected_item_on_item_detail_page(){

        productdetailspage.verifyProductDetailspage();
    }

    @When("^User adds item to the cart from product detail page$")
    public void user_adds_item_in_cart(){
        productdetailspage.addProductToTheCart();
    }
}
