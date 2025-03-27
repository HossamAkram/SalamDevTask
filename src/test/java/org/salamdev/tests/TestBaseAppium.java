package org.salamdev.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.Platform;
import org.salamdev.drivers.DriverManager;
import org.salamdev.utils.JsonUtil;
import org.salamdev.utils.PropertiesUtil;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Properties;

public class TestBaseAppium {

    protected AndroidDriver driver;
    protected JsonUtil testData;
    private AppiumDriverLocalService service;
    private static final Properties properties = PropertiesUtil.loadProperties();

    @BeforeClass
    public void setUpAppiumService() {
        service = new AppiumServiceBuilder()
                .withIPAddress(properties.getProperty("ipAddress")) // Set Appium server address
                .usingPort(Integer.parseInt(properties.getProperty("port"))) // Set the port
                .withArgument(() -> "--use-drivers", properties.getProperty("driver")) // Run Appium with a specific driver
                .withArgument(() -> "--allow-insecure", "chromedriver_autodownload")
                .build();
        service.start();
    }

    @BeforeMethod
    public void setUpDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName(properties.getProperty("device"))
                .noReset()
                .setPlatformName(Platform.ANDROID.name())
                .setUdid(properties.getProperty("udid"))
                .setAppPackage("com.android.chrome")
                .setAppActivity("com.google.android.apps.chrome.Main")
                .setCapability("appium:ignoreHiddenApiPolicyError", true);

        try {
            driver = new AndroidDriver(
                    new URI("http://"
                            + properties.getProperty("ipAddress") + ":"
                            + properties.getProperty("port")).toURL(), options);
        } catch (MalformedURLException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        testData = new JsonUtil("test-data");
        PropertiesUtil.loadProperties();
    }

    @AfterMethod
    public void tearDownDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterClass
    public void tearDownAppiumService() {
        if (service != null) {
            service.stop();
        }
    }
}
