package org.salamdev.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.salamdev.utils.ElementActions;


public class ContactUs {
    //variables
    WebDriver driver;

    //constructor
    public ContactUs(WebDriver driver) {
        this.driver = driver;
    }
    //locators
    private By firstName = By.id("form-field-name");
    private By lastName = By.id("form-field-field_b2d3f57");
    private By email = By.id("form-field-email");
    private By contactNumber = By.id("form-field-field_9b0729c");
    private By message = By.id("form-field-message");
    private By submitButton = By.xpath("//button[contains(@class, 'elementor-button')]");

    //actions
    @Step("Entering First Name: {fName}")
    public ContactUs enterFirstName(String fName) {
        ElementActions.sendData(driver, firstName, fName);
        return this;
    }

    @Step("Entering Last Name: {lName}")
    public ContactUs enterLastName(String lName) {
        ElementActions.sendData(driver, lastName, lName);
        return this;
    }

    @Step("Entering Email: {emailAddress}")
    public ContactUs enterEmail(String emailAddress) {
        ElementActions.sendData(driver, email, emailAddress);
        return this;
    }

    @Step("Entering Contact Number: {number}")
    public ContactUs enterContactNumber(String number) {
        ElementActions.sendData(driver, contactNumber, number);
        return this;
    }

    @Step("Entering Message: {msg}")
    public ContactUs enterMessage(String msg) {
        ElementActions.sendData(driver, message, msg);
        return this;
    }

    @Step("Clicking the Submit button")
    public ContactUs clickSubmit() {
        ElementActions.click(driver, submitButton);
        return this;
    }

    //validations
}
