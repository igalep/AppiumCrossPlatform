import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import po.logIn.LoginScreenPageAndroid;
import po.logIn.LoginScreenPageObject;
import po.logIn.LoginScreenPageiOS;
import util.PropertiesReaderSingleton;
import util.DriverManager;

public class LoginTests {
    private AppiumDriver<?> driver;


    @Before
    public void setUp() throws Exception {
        driver = DriverManager.returnDriver(PropertiesReaderSingleton.getInstance().getPropertyAsString("run.platform"));
    }


    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginTestAndroid() {
        LoginScreenPageObject loginScreenPageObject = new LoginScreenPageAndroid(driver);
        loginScreenPageObject.setUsername("userName");
        loginScreenPageObject.setPassword("password");
        loginScreenPageObject.clickOnLogin();

    }

    @Test
    public void loginTestiOS() {
        LoginScreenPageObject loginScreenPageObject = new LoginScreenPageiOS(driver);
        loginScreenPageObject.setUsername("userName");
        loginScreenPageObject.setPassword("password");
        loginScreenPageObject.clickOnLogin();
    }
}
