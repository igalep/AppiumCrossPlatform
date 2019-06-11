package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.net.URL;

public class DriverManager {
    public static AppiumDriver<?> returnDriver(String platform) throws Exception {
        AppiumDriver<?> driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (Boolean.parseBoolean(PropertiesReaderSingleton.getInstance().getPropertyAsString("run.hybrid"))) {
            capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
        }

        String completeURL = "http://" + PropertiesReaderSingleton.getInstance().getPropertyAsString("run.ip") + ":" + "4725" + "/wd/hub";

        switch (platform.toLowerCase()) {

            case "ios":
                capabilities.setCapability(MobileCapabilityType.APP, new File(PropertiesReaderSingleton.getInstance().getPropertyAsString("app.ios.path")).getAbsolutePath());
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, PropertiesReaderSingleton.getInstance().getPropertyAsString("device.ios.name"));
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                capabilities.setCapability(MobileCapabilityType.FULL_RESET,true);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                capabilities.setCapability("autoLaunch",true);
                driver = new IOSDriver<RemoteWebElement>(new URL(completeURL), capabilities);
                break;

            case "android":

                capabilities.setCapability(MobileCapabilityType.APP, new File(PropertiesReaderSingleton.getInstance().getPropertyAsString("app.android.path")).getAbsolutePath());
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, PropertiesReaderSingleton.getInstance().getPropertyAsString("device.android.name"));
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                capabilities.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                driver = new AndroidDriver<RemoteWebElement>(new URL(completeURL), capabilities);
                break;

            default:
                throw new Exception("Platform not supported");
        }
        return driver;
    }
}
