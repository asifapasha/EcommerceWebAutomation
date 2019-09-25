package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utils.AssertionUtils.assertEquals;
import static com.automation.utils.AssertionUtils.assertPresent;
import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.createDynamicLocator;
import static com.automation.utils.WebElementUtils.waitForVisible;
import static org.junit.Assert.assertTrue;

public class CartPage {
    public CartPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(className = "icon-ok")
    private  WebElement productSuccessfullyadded;

    @FindBy(id = "layer_cart")
    private WebElement productConfiramationOverlay;

    @FindBy(id = "layer_cart_product_title")
    private WebElement productNameOnCart;

    @FindBy(xpath = "//span[@class='product-name']")
    private WebElement addedproductTocart;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private  WebElement proceedBtn;

    public void verifyAddedProductToCartPage(String productName) {
        waitForVisible(productConfiramationOverlay);
       assertEquals(productNameOnCart, productName);
    }
    public void clickOnProceedToCheckoutbutton(){
        clickOnElement(proceedBtn);
    }
}
