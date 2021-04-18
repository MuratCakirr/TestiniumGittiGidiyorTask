package Enums;

import org.openqa.selenium.By;

public class Object {

    public static final By txtSearchPath = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input");
    public static final By selectProductPath = By.id("item-info-block-660433083");
    public static final By productPricePath = By.xpath("//*[@id=\"sp-price-discountPrice\"]");
    public static final By productPriceBasketPath = By.className("product-new-price");
    public static final By goBasketPath = By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/div/div/div[2]/div[4]/div[1]/a");
    public static final By numberProductPath = By.xpath("//*[@class='amount']");
    public static final By deleteProductPath = By.xpath("//*[@class='btn-delete btn-update-item']");
    public static final By txtEmailPath = By.id("L-UserNameField");
    public static final By txtPasswordPath = By.id("L-PasswordField");
    public static final By ggLoginPath = By.id("gg-login-enter");
    public static final By addToBasketPath = By.id("add-to-basket");
    public static final By BeforeUserLoginBtnPath = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[1]/div[2]");
    public static final By UserLoginBtnPath = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a");
}
