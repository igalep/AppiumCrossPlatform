import cucumber.api.java.Before;
import cucumber.api.java8.En;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Assert;
import po.landing.LandingPage;
import po.logIn.LogInPageFactory;
import po.logIn.LoginScreenPageObject;
import util.Utils;

/**
 * Created by epshtein.
 */


public class LogInStepDef implements En {
    private AppiumDriver<?> driver;
    String env;


    @Before
    public void setUp() throws Exception {
        env = Utils.readProperty("run.platform");
        driver = Utils.returnDriver(env);
    }

    public LogInStepDef() {
        Given("^I logged in with \"([^\"]*)\" and \"([^\"]*)\"$", (String userName, String password) -> {
            LoginScreenPageObject loginScreenPageObject = LogInPageFactory.getPage(env, driver);
            loginScreenPageObject.setUsername(userName);
            loginScreenPageObject.setPassword(password);
            loginScreenPageObject.clickOnLogin();
        });

        Then("^the landing page is \"([^\"]*)\"$", (String flag) -> {
            boolean bFlag= Boolean.getBoolean(flag);

            Assert.assertEquals(bFlag , new LandingPage(driver).isDisplayed());
        });
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
