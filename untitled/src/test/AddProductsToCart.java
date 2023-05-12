import address.PageAddress;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductsPage;

import java.util.List;

import static org.testng.AssertJUnit.*;

public class AddProductsToCart extends BaseTest{

    String env = "test";
    private PageAddress pageAddress = new PageAddress(env, driver);
    @Test
    public void addProductsToCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        assertEquals(pageAddress.getHomePageUrl(), getCurrentAddress());
        ProductsPage productsPage = homePage.openProducts();
        List<String> product1Details = productsPage.selectProductByIndex(1);
        productsPage.confirmAlertToContinueShopping();
        List<String> product2Details = productsPage.selectProductByIndex(2);
        CartPage cartPage = productsPage.viewCartFromAlert();
        cartPage.compareAddedProductsWithCart(product1Details, 1);
    }
}
