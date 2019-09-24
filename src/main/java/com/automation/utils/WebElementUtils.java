package com.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.automation.utils.DriverUtils.driver;
import static com.automation.utils.DriverUtils.getDriver;

public class WebElementUtils {
    static Long timeout = Long.parseLong("30");
    static WebDriverWait wait = new WebDriverWait(getDriver(), timeout);

    public static void waitForVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForNotVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForElementToBeClickable(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementToBeSelected(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeSelected(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectDateFromCalender(WebElement element, String date, String format) throws ParseException {
        String dateXpath = "//*[@data-date-picker='book-trip']//td[@data-month='%s' and @data-year='%s']//a[text()='%s']";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date parse = sdf.parse(date);
        Calendar c = Calendar.getInstance();
        c.setTime(parse);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);

        element.click();
        dateXpath = String.format(dateXpath, month, year, day);
        driver.findElement(By.xpath(dateXpath)).click();
    }

    public static  void selectValueFromDropDown(WebElement element, String value) {
        Select option = new Select(element);
        option.selectByValue(value);
    }


    public static  void selectValueFromDropDownByVisibleTxt(WebElement element, String value) {
        Select option = new Select(element);
        option.selectByVisibleText(value);
    }

    public static WebElement createDynamicLocator(String xpath,String formatingString) {
        WebElement element = driver.findElement(By.xpath(String.format(xpath,formatingString)));
        waitForVisible(element);
        return element;
    }


    public void demo1(String arg1, String arg2) {

    }
}
