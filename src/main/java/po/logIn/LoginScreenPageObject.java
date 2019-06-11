package po.logIn;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import po.base.BasePage;


public abstract  class LoginScreenPageObject extends BasePage implements LoginInterface{
    @AndroidFindBy(id = "androidUserName")
    @iOSXCUITBy(accessibility = "iOSUsername")
    MobileElement username;

    @AndroidFindBy(id = "AndroidPassword")
    @iOSXCUITBy(accessibility = "iOSPassword")
    MobileElement password;



    public LoginScreenPageObject(AppiumDriver<?> driver) {
        super(driver);
    }


    public void setUsername(String user) {
        clickOnElement(username);
    }
    
    public void setPassword(String pass) {
        sendKeysToElement(password);
    }

    public abstract void clickOnLogin();
}
