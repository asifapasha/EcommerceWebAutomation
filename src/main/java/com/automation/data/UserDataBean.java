package com.automation.data;

import org.apache.commons.lang.RandomStringUtils;

public class UserDataBean {
    String userEmail;
    String firstName;
    String lastName;
    String mobilePhoneNum;
    String password;
    String company;
    String address;
    String aliasName;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobilePhoneNum() {
        return mobilePhoneNum;
    }

    public void setMobilePhoneNum(String mobilePhoneNum) {
        this.mobilePhoneNum = mobilePhoneNum;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }


    public void generateRandomUserData() {
        userEmail = RandomStringUtils.randomAlphabetic(8) + "@mailinator.com";
        firstName = RandomStringUtils.randomAlphabetic(12);
        lastName = RandomStringUtils.randomAlphabetic(8);
        mobilePhoneNum = RandomStringUtils.randomNumeric(10);
        aliasName = RandomStringUtils.randomAlphabetic(10);
        password = RandomStringUtils.randomAlphanumeric(8);
        company = RandomStringUtils.randomAlphabetic(10);
        address = RandomStringUtils.randomAlphanumeric(12);

        System.out.println(userEmail + "=====" + mobilePhoneNum + "=====" + password);
    }

}
