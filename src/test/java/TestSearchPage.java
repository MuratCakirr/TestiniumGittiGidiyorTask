import Base.Base;
import Enums.Constant;
import Model.SearchPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;
import utilities.Log4j;

public class TestSearchPage extends Base {

    public static SearchPage searchPage;

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testSearch() throws Exception {
        Log4j.startLog("Test is Starting");

        searchPage = new SearchPage(driver);

        searchPage.txtSearch().clear();
        searchPage.txtSearch().sendKeys(Constant.productName);

        searchPage.selectSecond().click();

        searchPage.selectProduct().click();

        searchPage.addToBasket();

        String itemPriceBasket = searchPage.productPriceBasket().getText();
        String itemPrice = searchPage.productPrice().getText();

        if(itemPriceBasket.equals(itemPrice)==true){
            Log4j.info("Price on the product page is equal to the price in the basket.");
        }

        searchPage.goBasket().click();

        Select select = new Select(searchPage.numberProduct());
        select.selectByValue("2");

        if(searchPage.numberProduct().getAttribute("value").equals("2")){
            Log4j.info("The number of products is correct");
        }

        searchPage.deleteProduct().click();

        if(searchPage.isEmpty().isEnabled()==true){
            Log4j.info("Basket is empty");
        }else {
            Log4j.info("Basket is full");
            driver.quit();
        }

        Thread.sleep(5000);
    }

    @After
    public void endDown(){
        Log4j.endLog("Test is Ending");
        driver.quit();
    }

}
