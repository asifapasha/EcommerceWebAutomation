package com.automation.pages;

import com.automation.data.UserDataBean;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.automation.utils.AssertionUtils.assertEquals;
import static com.automation.utils.AssertionUtils.assertPresent;
import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.waitForVisible;

public class SummaryPage {
    public SummaryPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(@class,'step_')]")
    private List<WebElement> stepsList;

    @FindBy(xpath = "//*[@id='cart_summary']//th[contains(@class,'cart')]")
    private List<WebElement> tableheader;

    @FindBy(className = "heading-counter")
    private WebElement productsCountInTheCart;

    @FindBy(className = "cart_description")
    private WebElement productDescription;
    @FindBy(xpath = "//td[@class='cart_description']/p[@class='product-name']")
    private WebElement productName;
    @FindBy(className = "cart_ref")
    private WebElement productModelNum;
    @FindBy(xpath = "//td[@class='cart_description']//a[contains(text(),'Color : Yellow, Size : S')]")
    private WebElement productcolorAndSize;
    @FindBy(xpath = "//*[@class=\"price special-price\"]")
    private WebElement productPrice;
    @FindBy(xpath = "//*[contains(@class,'cart_quantity_input')]")
    private WebElement productQty;

    @FindBy(id = "total_product")
    private WebElement productTotalPrice;
    @FindBy(id = "total_shipping")
    private WebElement shippingcost;
    @FindBy(id = "total_price_without_tax")
    private WebElement totalPriceWithoutTax;
    @FindBy(id = "total_tax")
    private WebElement taxAmount;
    @FindBy(id = "total_price")
    private WebElement totalpriceAfterTax;

    @FindBy(xpath = "//ul[@class='address first_item item box']//*[@class='address_city']")
    private WebElement cityAndStateName;

    @FindBy(xpath = "//ul[@class='address first_item item box']//*[@class='address_city']//following::li[1]")
    private WebElement countryName;

    @FindBy(xpath = "//ul[@class='address first_item item box']//span[@class='address_phone_mobile']")
    private WebElement deliveryaddressMobileNum;

    @FindBy(xpath = "//ul[@class='address first_item item box']//span[@class='address_name']")
    private WebElement deliveryAddressName;

    @FindBy(xpath = "//ul[@class='address first_item item box']//span[@class='address_company']")
    private WebElement deliveryCompanyName;
    @FindBy(xpath = "//*[@class='cart_navigation clearfix']//span[contains(text(),'Proceed')]")
    private WebElement proceedTocheckOutbutton;


    public void verifyOrderedProductDetail() {
        verifyOrderPageElements();
        verifyProductDetailsONOrderpage();
        productBillingInfo();
        verifyDeliveryAddress();
    }

    public void verifyOrderPageElements() {
        waitForVisible(productsCountInTheCart);

        for (int i = 0; i < stepsList.size(); i++) {
            assertPresent(stepsList.get(i));
        }
        for (int j = 0; j < tableheader.size(); j++) {
            assertPresent(tableheader.get(j));
        }
    }

    public void verifyProductDetailsONOrderpage() {
        assertEquals(productName, System.getProperty("product.productName"));
        assertEquals(productModelNum, System.getProperty("product.productModel"));
        assertEquals(productPrice, System.getProperty("product.productPrice"));
        assertEquals(productcolorAndSize, System.getProperty("product.productColor"));
        assertEquals(productQty, System.getProperty("product.productQty"));
    }

    public void productBillingInfo() {
        String actualSubTotal = totalPriceWithoutTax.getText().replace("$", "");
        float expectedTotal = Float.parseFloat(productTotalPrice.getText().replace("$", "")) + Float.parseFloat(shippingcost.getText().replace("$", ""));
        assertEquals(productPrice, actualSubTotal, String.valueOf(expectedTotal));

    }

    public void verifyDeliveryAddress() {
//        UserDataBean bean = loginpage.getRandomUserData();
//        assertEquals(deliveryAddressName, bean.getFirstName());
//        assertEquals(deliveryCompanyName, bean.getCompany());
//        assertEquals(deliveryaddressMobileNum, bean.getMobilePhoneNum());
        assertEquals(cityAndStateName, System.getProperty("userdata.bean.city"));
        assertEquals(cityAndStateName, System.getProperty("userdata.bean.state"));
        assertEquals(countryName, System.getProperty("userdata.bean.country"));
    }
    public void proceedTocheckOut(){
        clickOnElement(proceedTocheckOutbutton);

    }
/*
Type casting from String to Float:
Type casting defination: Whenever we want to convert one data type into another data type
    public static void main(String[] args) {
        String subTotal = "$45.23";
        String tax = "$6.5";

        subTotal = subTotal.replace("$", "");
        tax = tax.replace("$", "");

        float total = Float.parseFloat(subTotal) + Float.parseFloat(tax);
        System.out.println(total);
        }
*/

}
