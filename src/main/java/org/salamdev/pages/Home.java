package org.salamdev.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.salamdev.utils.BrowserActions;
import org.salamdev.utils.ElementActions;
import org.salamdev.utils.PropertiesUtil;
import org.salamdev.utils.Validations;

public class Home {

    //variables
    WebDriver driver;

    //constructor
    public Home(WebDriver driver){
        this.driver=driver;
    }

    //locators
    private By contactUsButton=  By.xpath("//span[text()='Contact us']");
    private By changeLanguageDropdownlist=By.xpath("//div[@class='gt-current-lang']");
    private By arabicLanguageOption=By.xpath("//a[contains(text(),'Arabic')]");
    private By englishLanguageOption=By.xpath("//a[contains(text(),'English')]");



    //navigate to the page
    @Step("Navigate to Home Page")
    public Home navigateToHomePage(){
        BrowserActions.navigateToUrl(driver, PropertiesUtil.getPropertyValue("homePage"));
        return this;
    }

    //actions
    @Step("Clicking on 'Contact Us' button")
    public Home clickContactUs() {
        ElementActions.click(driver, contactUsButton);
        return this;
    }

    @Step("Opening language dropdown list")
    public Home openLanguageDropdown() {
        ElementActions.click(driver, changeLanguageDropdownlist);
        return this;
    }

    @Step("Selecting Arabic language")
    public Home selectArabicLanguage()  {
        ElementActions.click(driver, arabicLanguageOption);
        return this;
    }

    @Step("Selecting English language")
    public Home selectEnglishLanguage() {
        ElementActions.click(driver, englishLanguageOption);
        return this;
    }

    // Validations
    @Step("Validating redirection to Contact Us page")
    public ContactUs validateRedirectionToContactUs() {
        String currentUrl = BrowserActions.getCurrentUrl(driver);
        Validations.validateEquals(currentUrl, PropertiesUtil.getPropertyValue("contactUsPage"), "Redirection to Contact Us page failed!");
        return new ContactUs(driver);
    }

}
