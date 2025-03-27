package org.salamdev.tests;

import org.salamdev.drivers.DriverManager;
import org.salamdev.listeners.TestNGListeners;
import org.salamdev.utils.BrowserActions;
import org.salamdev.utils.JsonUtil;
import org.salamdev.utils.PropertiesUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestBase {
    //variables
    JsonUtil testData;
    //configurations
    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        testData = new JsonUtil("test-data");
        DriverManager.createInstance("edge");
        PropertiesUtil.loadProperties();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {

        if (DriverManager.getDriver() != null) {
            BrowserActions.closeBrowser(DriverManager.getDriver());

        }
    }
    @AfterMethod
    public void afterMethod() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
