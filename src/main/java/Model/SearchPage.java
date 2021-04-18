package Model;

import Enums.Constant;
import Enums.Object;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement txtSearch() {
        return driver.findElement(Object.txtSearchPath);
    }

    public WebElement selectSecond() {
        return driver.findElement(By.linkText(Constant.productName));
    }

    public WebElement selectProduct() {
        return driver.findElement(Object.selectProductPath);
    }

    public WebElement addToBasket() {
        WebElement element = driver.findElement(Object.addToBasketPath);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
        return element;
    }

    public WebElement productPrice(){
        return driver.findElement(Object.productPricePath);
    }

    public WebElement productPriceBasket(){
        return driver.findElement(Object.productPriceBasketPath);
    }

    public WebElement goBasket(){
        return driver.findElement(Object.goBasketPath);
    }

    public WebElement numberProduct(){
        return driver.findElement(Object.numberProductPath);
    }

    public WebElement deleteProduct(){
        return driver.findElement(Object.deleteProductPath);
    }

    public WebElement isEmpty(){
        return driver.findElement(By.linkText("anasayfaya"));
    }

}
