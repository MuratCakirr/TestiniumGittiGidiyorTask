import Base.Base;
import Enums.Constant;
import Model.HomePage;
import Model.LogInPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Log4j;

public class TestLogInPage extends Base {

    public static LogInPage elementPage;
    public static HomePage homePage;

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testUyeol() throws Exception {
        Log4j.startLog("Test is Starting");

        homePage = new HomePage(driver);

        homePage.BeforeUserLoginBtn().click();
        homePage.UserLoginBtn().click();

        elementPage = new LogInPage(driver);

        elementPage.txtEmail().clear();
        elementPage.txtEmail().sendKeys(Constant.email);

        elementPage.txtPassword().clear();
        elementPage.txtPassword().sendKeys(Constant.userPassword);

        elementPage.ggLogin().click();

        Thread.sleep(5000);
    }

    @After
    public void endDown(){
        Log4j.endLog("Test is Ending");
        driver.quit();
    }
}
