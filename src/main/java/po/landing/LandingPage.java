package po.landing;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import po.base.BasePage;

/**
 * Created by epshtein.
 */
public class LandingPage extends BasePage {

    @AndroidFindBy(id = "landing_page_title")
    @iOSXCUITBy(accessibility = "LandingPageTitle")
    private MobileElement landingPageIndicator;

    public LandingPage(AppiumDriver<?> driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        try {
            return landingPageIndicator.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
