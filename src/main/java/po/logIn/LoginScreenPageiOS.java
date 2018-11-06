package po.logIn;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginScreenPageiOS extends LoginScreenPageObject {
    @iOSFindBy(accessibility = "LogInButton")
    MobileElement login;
    IOSDriver _driver;

    public LoginScreenPageiOS(AppiumDriver driver) {
        super(driver);
        _driver = (IOSDriver) driver;
    }


    public void clickOnLogin() {
        //some specific logic for iOS
        login.click();
    }
}
