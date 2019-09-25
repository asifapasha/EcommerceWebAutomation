package com.automation.pages;

import com.automation.utils.AssertionUtils;
import com.automation.utils.CommonUtils;
import com.automation.utils.ConfigUtils;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utils.AssertionUtils.*;
import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.createDynamicLocator;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "login")
    private WebElement signInBtn;

    @FindBy(className = "account")
    private WebElement userNameText;

    @FindBy(xpath = "//*[@class='account']/span")
    private  WebElement registeredUserName;

    @FindBy(id = "header_logo")
    private  WebElement logoImage;

    public void verifyUserOnHomepage() {
        assertPageTitle(getPropertyByKey("homepage.title"));
    }

    public void navigateToLoginPage() {
        clickOnElement(signInBtn);
    }

    public void verifyUserNameAfterLogin() {
        assertEquals(userNameText, userNameText.getText(), getPropertyByKey("loggedin.user"));
    }

    public void verifyUserAfterRegistration(){
        String expectedText = System.getProperty("userdata.bean.firstName") + " " + System.getProperty("userdata.bean.lastName");
        assertEquals(registeredUserName, expectedText);
    }

    public void selectItemFromHOmePage(String itemName) {
        clickOnElement(logoImage);
        WebElement itemNameElement = createDynamicLocator("//*[contains(text(),'%s')]", itemName);
        clickOnElement(itemNameElement);
    }



}
