package po.logIn;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import po.BasePage;


public abstract  class LoginScreenPageObject extends BasePage implements LoginInterface{
    @AndroidFindBy(id = "androidUserName")
    @iOSFindBy(accessibility = "iOSUsername")
    MobileElement username;

    @AndroidFindBy(id = "AndroidPassword")
    @iOSFindBy(accessibility = "iOSPassword")
    MobileElement password;



    public LoginScreenPageObject(AppiumDriver<?> driver) {
        super(driver);
    }


    public void setUsername(String user) {
        username.sendKeys(user);
    }
    
    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    public abstract void clickOnLogin();
}
