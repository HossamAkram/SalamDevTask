package org.salamdev.tests;

import org.salamdev.drivers.DriverManager;
import org.salamdev.listeners.TestNGListeners;
import org.salamdev.pages.Home;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListeners.class)
public class E2eTest extends TestBase {

    //test
    @Test
    public void e2eTest(){
        new Home(DriverManager.getDriver())
                .navigateToHomePage()
                .clickContactUs()
                .validateRedirectionToContactUs()
                //.enterFirstName(testData.getJsonData("contactUsData.firstName"))
                .enterLastName(testData.getJsonData("contactUsData.lastName"))
                .enterEmail(testData.getJsonData("contactUsData.email"))
                .enterContactNumber(testData.getJsonData("contactUsData.contactNumber"))
                .enterMessage(testData.getJsonData("contactUsData.message"))
                .clickSubmit();
    }
}
