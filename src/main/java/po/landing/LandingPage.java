package po.landing;

import io.appium.java_client.AppiumDriver;
import po.base.BasePage;

/**
 * Created by epshtein.
 */
public class LandingPage extends BasePage {
    public LandingPage(AppiumDriver<?> driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        return true;
    }
}
