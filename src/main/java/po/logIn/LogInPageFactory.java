package po.logIn;

import io.appium.java_client.AppiumDriver;

/**
 * Created by epshtein.
 * Date: 30/10/2018
 */
public class LogInPageFactory {
    public static LoginScreenPageObject getPage(String env, AppiumDriver driver){
        switch (env) {
            case "iOS":
                return new LoginScreenPageiOS(driver);
            case "android":
                return new LoginScreenPageAndroid(driver);


            default:
                    return null;
        }
    }
}
