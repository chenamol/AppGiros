package co.com.todo1.certification.appgyfpersonas.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class LaApp {
    private WebDriver myDriver;

    public static LaApp enElCelular() {
        return new LaApp();
    }

    public WebDriver getMyDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Galaxy S10");
        capabilities.setCapability("appPackage", "com.todo1.qa.gyf");
        capabilities.setCapability("appActivity", "com.todo1.qa.gyf.MainActivity");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("noReset", true);
       // capabilities.setCapability("unicodeKeyboard", true);
       // capabilities.setCapability("resetKeyboard", true);
        capabilities.setCapability("automationName", "uiautomator2");

        try {
            myDriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
        }
        return myDriver;
    }
}