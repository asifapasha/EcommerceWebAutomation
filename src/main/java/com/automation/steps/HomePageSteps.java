package com.automation.steps;

import com.automation.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    HomePage homepage = new HomePage();


    @Given("^User is on Homepage of the application$")
    public void userIsOnHomepage() {
        homepage.verifyUserOnHomepage();
    }

    @When("^User navigates to login page$")
    public void verifyUserIsonLoginPage() {
        homepage.navigateToLoginPage();
    }

    @Then("^Verify successful login$")
    public void verifySuccessfulUserlogin() {
        homepage.verifyUserNameAfterLogin();
    }

    @Then("^Verify registered user on homepage$")
    public void verifyRegisteredUserOnHomepage() {
        homepage.verifyUserAfterRegistration();
    }

    @When("^User selects \"([^\"]*)\" from homepage$")
    public void user_selects_from_homepage(String itemName) {
        homepage.selectItemFromHOmePage(itemName);
    }
}
