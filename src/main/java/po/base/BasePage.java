package po.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage implements BaseInterface{
    AppiumDriver driver;


    protected BasePage(AppiumDriver<?> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(15)), this);
    }

    public void clickOnElement(MobileElement element){
        element.click();
    }

    public void sendKeysToElement(MobileElement element){
        element.sendKeys();
    }

    public void tapOnElement(MobileElement element){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(element.getCenter())).perform();
    }
}
