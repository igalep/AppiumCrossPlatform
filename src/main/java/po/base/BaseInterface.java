package po.base;

import io.appium.java_client.MobileElement;

/**
 * Created by epshtein.
 * Date: 2019-06-11
 */
public interface BaseInterface {
    void clickOnElement(MobileElement element);
    void sendKeysToElement(MobileElement element);
    void tapOnElement(MobileElement element);
}
