package com.automation.pages;

import com.automation.data.UserDataBean;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.peer.SystemTrayPeer;
import java.util.List;

import static com.automation.utils.AssertionUtils.assertEquals;
import static com.automation.utils.AssertionUtils.assertPresent;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.waitForVisible;

public class OrderPage {
    LoginPage loginpage = new LoginPage();

    public OrderPage() {
        PageFactory.initElements(getDriver(), this);
    }

}

