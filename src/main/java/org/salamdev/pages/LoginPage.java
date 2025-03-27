package org.salamdev.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.salamdev.utils.ElementActions;

public class LoginPage {

    private final AppiumDriver driver; // AppiumDriver for mobile testing

    // Locators using AppiumBy.id
    private By username = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"user-name\")\n");
    private By password = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"password\")\n");
    private By loginButton = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"login-button\")");

    // Constructor
    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    @Step("Navigate to SauceDemo login page")
    public LoginPage navigateToLoginPage() {
        driver.get("https://www.saucedemo.com/");
        return this;
    }

    @Step("Enter username {0}")
    public LoginPage enterUsername(String username) {

       driver.findElement(this.username).click();
       driver.findElement(this.username).sendKeys(username);
       return this;
    }

    @Step("Enter password {0}")
    public LoginPage enterPassword(String password) {
        driver.findElement(this.password).click();
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    @Step("Scroll to login button and click")
    public void clickLogin() {
        driver.findElement(this.loginButton).click();

    }

}
