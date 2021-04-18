package Model;

import Enums.Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
    public static WebDriver driver;

    public LogInPage(WebDriver webDriver) {
        driver = webDriver;

    }

    public WebElement txtEmail() {
        return driver.findElement(Object.txtEmailPath);
    }

    public WebElement txtPassword() {
        return driver.findElement(Object.txtPasswordPath);
    }

    public WebElement ggLogin() {
        return driver.findElement(Object.ggLoginPath);

    }
}
