package com.automation.steps;

import com.automation.pages.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
    LoginPage loginpage = new LoginPage();

    @Then("^Verify user on login page$")
    public void verify_user_on_login_page() throws InterruptedException {
         loginpage.verifyUserIsOnLoginPage();
    }
    @When("^User logs in with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logs_in_with_and(String userid, String password){
        loginpage.login(userid, password);

    }
    @Then("^Verify error message for invalid credentials$")
    public void verifyErrorMessage(){
        loginpage.userLogsinwithInvalidCredentials();
    }

}
