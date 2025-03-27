package org.salamdev.tests;

import org.salamdev.listeners.TestNGListeners;
import org.salamdev.pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListeners.class)
public class LoginTest extends TestBaseAppium{
    @Test
    public void testValidLogin() {
        new LoginPage(driver)
                .navigateToLoginPage()
                .enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();
    }

}
