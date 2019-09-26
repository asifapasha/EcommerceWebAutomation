package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.automation.utils.AssertionUtils.assertPresent;
import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.DriverUtils.getDriver;

public class AddressPage {
    public AddressPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='address item box']/li")
    private List<WebElement> deliveryAddress;

    @FindBy(xpath = "//ul[@class='address alternate_item box']/li")
    private List<WebElement> billingAddress;

    @FindBy(xpath = "//*[@class='button btn btn-default button-medium']")
    private WebElement checkOutButton;

    public void verifyDeliveryAddress() {
        for (int i = 0; i < deliveryAddress.size(); i++) {
            assertPresent(deliveryAddress.get(i));
        }
    }

    public void verifyBillingAddress() {
        for (int j = 0; j < billingAddress.size(); j++) {
            assertPresent(billingAddress.get(j));
        }

    }

    public void verifyAddressOnAddressPage(String addressType) {
        switch (addressType.toLowerCase()) {
            case "billing address":
                verifyBillingAddress();
            case "Delivery address":
                verifyDeliveryAddress();
            case "Billing and delivery address":
                verifyBillingAddress();
                verifyDeliveryAddress();
            default:
                System.err.println("Not implemented yet !!!");
        }
    }

    public void clickOnProceedToCheckOutbutton() {
        clickOnElement(checkOutButton);
    }


}
