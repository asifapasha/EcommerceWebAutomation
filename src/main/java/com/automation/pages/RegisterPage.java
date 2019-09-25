package com.automation.pages;

import com.automation.data.UserDataBean;
import com.automation.utils.CommonUtils;
import com.automation.utils.WebElementUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.CommonUtils.sendKeysTo;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.selectValueFromDropDown;
import static com.automation.utils.WebElementUtils.selectValueFromDropDownByVisibleTxt;

//Solution to fix the cursor Issue is pressing shift and zero (Switch off the Num lk Key
//Short cut to format ctrl + alt + l
public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(getDriver(), this);
    }

    LoginPage loginPage = new LoginPage();

    @FindBy(id = "id_gender2")
    private WebElement femaleGenderBtn;
    @FindBy(id = "customer_firstname")
    private WebElement firstName;
    @FindBy(id = "customer_lastname")
    private WebElement lastName;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(id = "days")
    private WebElement selectDate;
    @FindBy(id = "months")
    private WebElement selectMonth;
    @FindBy(id = "years")
    private WebElement selectYear;
    @FindBy(id = "company")
    private WebElement companyName;
    @FindBy(id = "address1")
    private WebElement address;
    @FindBy(id = "city")
    private WebElement cityName;
    @FindBy(id = "id_state")
    private WebElement stateName;
    @FindBy(id = "postcode")
    private WebElement zipCode;
    @FindBy(id = "id_country")
    private WebElement countryName;
    @FindBy(id = "other")
    private WebElement additionalField;
    @FindBy(id = "phone")
    private WebElement homePhone;
    @FindBy(id = "phone_mobile")
    private WebElement mobilePhone;
    @FindBy(id = "alias")
    private WebElement aliasName;
    @FindBy(id = "submitAccount")
    private WebElement registerBtn;

    public void registerUsingRandomData(){
        //String result = classObj.xcu()Method which returns the string
        //In line 57 its returning object of Userdatabean class and executing the methos from loginpage
        UserDataBean bean = loginPage.enterEmailFOrRegistration();

        //Filling the random data on registration page
        clickOnElement(femaleGenderBtn);
        sendKeysTo(firstName, bean.getFirstName());
        sendKeysTo(lastName,bean.getLastName());
        sendKeysTo(password,bean.getPassword());
            //DOB Selection
        selectValueFromDropDown(selectDate, "12");
        selectValueFromDropDown(selectMonth, "5");
        selectValueFromDropDown(selectYear, "1992");

        sendKeysTo(companyName, bean.getCompany());
        sendKeysTo(address, bean.getAddress());

        // city , state and country name
        String city = "Birmingham";
        String state = "Alabama";
        String country = "United States";
        sendKeysTo(cityName,city);
        selectValueFromDropDownByVisibleTxt(stateName,state);
        sendKeysTo(zipCode,"32234");
        selectValueFromDropDownByVisibleTxt(countryName,country);
        sendKeysTo(mobilePhone,bean.getMobilePhoneNum());
        sendKeysTo(aliasName,bean.getAliasName());
        clickOnElement(registerBtn);

        System.setProperty("userdata.bean.firstName", bean.getFirstName());
        System.setProperty("userdata.bean.lastName", bean.getLastName());

        // Setting the value for city, state and country
        System.setProperty("userdata.bean.city", city);
        System.setProperty("userdata.bean.state",state);
        System.setProperty("userdata.bean.country",country);
    }

}
