package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static com.automation.utils.DriverUtils.getDriver;

public class OrderConfirmationPage {
    public OrderConfirmationPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//div[@class=\"box\"]/br[5]")
    private WebElement orderRefNumber;

    public void getOrderReferenceNumber() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + orderRefNumber.getText());
    }

    public static void main(String[] args) throws ParseException {
//        String actaulDate = dateWebelement.getText();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        LocalDateTime ldt = LocalDateTime.now();
        String expectedDate = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(ldt);

    }
}
