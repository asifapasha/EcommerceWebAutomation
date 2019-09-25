package com.automation.pages;

import com.automation.data.ProductDetailsBean;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.automation.utils.AssertionUtils.assertEquals;
import static com.automation.utils.AssertionUtils.assertPresent;
import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.DriverUtils.getDriver;

public class ProductDetailsPage {
    ProductDetailsBean productDetailsBean = new ProductDetailsBean();

    public ProductDetailsPage() {
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(xpath = "//*[@itemprop='name']")
    private WebElement productName;
    @FindBy(xpath = "//span[@itemprop=\"sku\"]")
    private WebElement productModel;
    @FindBy(id = "our_price_display")
    private WebElement productPrice;
    @FindBy(id = "reduction_percent_display")
    private WebElement productDiscount;
    @FindBy(id = "quantity_wanted")
    private WebElement productQty;
    @FindBy(id = "group_1")
    private WebElement productSize;
    @FindBy(xpath = "//select[@id='group_1']/option[@selected=\"selected\"]")
    private WebElement defaultSizeSelection;
    @FindBy(xpath = "//*[@id='color_to_pick_list']/li")
    private List<WebElement> productColorList;

    @FindBy(id = "add_to_cart")
    private WebElement addToCartBtn;

    public void verifyProductDetailspage(){
        assertPresent(productName);
        assertPresent(productModel);
        assertPresent(productDiscount);
        assertPresent(productPrice);
        assertPresent(productQty);
        assertEquals(defaultSizeSelection, defaultSizeSelection.getAttribute("title"),"S");
        for(int i = 0; i< productColorList.size(); i++){
            assertPresent(productColorList.get(i));
        }

        WebElement colorSelection = productColorList.get(1);

        productDetailsBean.setProductName(productName.getText());
        productDetailsBean.setProductModelNo(productModel.getText());
        productDetailsBean.setProductDiscount(productDiscount.getText());
        productDetailsBean.setProductPrice(productPrice.getText());
        productDetailsBean.setProductQty(productQty.getText());
        productDetailsBean.setProductSize(productSize.getText());
        productDetailsBean.setProductColor(colorSelection.getText());

        System.setProperty("product.productName", productDetailsBean.getProductName());
        System.setProperty("product.productModel", productDetailsBean.getProductModelNo());
        System.setProperty("product.productDiscount", productDetailsBean.getProductDiscount());
        System.setProperty("product.productPrice", productDetailsBean.getProductPrice());
        System.setProperty("product.productQty", productDetailsBean.getProductQty());
        System.setProperty("product.productColor", productDetailsBean.getProductColor());

    }

    public void addProductToTheCart(){
     clickOnElement(addToCartBtn);
    }
}
