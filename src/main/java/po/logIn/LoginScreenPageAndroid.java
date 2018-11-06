package po.logIn;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreenPageAndroid extends LoginScreenPageObject{


    @AndroidFindBy(id = "LoginButton")
    MobileElement login;
    AndroidDriver _driver;


    public LoginScreenPageAndroid(AppiumDriver driver) {
        super(driver);
        _driver = (AndroidDriver) driver;
    }

    public void clickOnLogin() {
        //some specific logic for Android

        login.click();
    }
}
