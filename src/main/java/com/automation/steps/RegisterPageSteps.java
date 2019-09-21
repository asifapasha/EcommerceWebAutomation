package com.automation.steps;

import com.automation.pages.RegisterPage;
import cucumber.api.java.en.When;

public class RegisterPageSteps {
RegisterPage registerpage = new RegisterPage();
    @When("^User fills registration details$")
    public void user_fills_registration_details(){
        registerpage.registerUsingRandomData();
    }

}
