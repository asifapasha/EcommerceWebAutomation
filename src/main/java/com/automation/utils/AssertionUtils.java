package com.automation.utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static com.automation.utils.DriverUtils.getDriver;

public class AssertionUtils {
    public static void assertPresent(WebElement element) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Element %s should be displayed !!!", element.getText()), element.isDisplayed());
    }

    private static void waitForVisible(WebElement element) {
    }

    public static void assertNotPresent(WebElement element) {
        Assert.assertTrue(String.format("Element %s is not displayed !!!", element.getText()), !element.isDisplayed());
    }

    public static void assertEquals(WebElement element, String actual, String expected) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Actual text is %s and expected text is %s", actual, expected), actual.contains(expected));
    }

    public static void assertEquals(WebElement element, String expected) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Actual text is %s and expected text is %s", element.getText(), expected), element.getText().contains(expected));
    }

    public static void assertPageTitle(String expected) {
        String actualTitle = getDriver().getTitle();
        Assert.assertTrue(String.format("Actual text is %s and expected text is %s", actualTitle  , expected), actualTitle.contains(expected));
    }
}
