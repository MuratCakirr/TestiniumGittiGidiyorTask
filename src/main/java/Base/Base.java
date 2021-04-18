package Base;

import Model.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Base {

    public static WebDriver driver;
    public static LogInPage elementPage;

    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\milan\\Desktop\\muronun projeleri\\seleniumProject\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, SECONDS);

        driver.manage().timeouts().pageLoadTimeout(200, SECONDS);

        driver.manage().window().maximize();

        driver.get("https://www.gittigidiyor.com/");
    }
}
