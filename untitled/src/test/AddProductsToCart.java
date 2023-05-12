import address.PageAddress;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;

import static org.testng.AssertJUnit.*;

public class AddProductsToCart extends BaseTest{

    private PageAddress pageAddress;
    @Test
    public void addProductsToCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        assertEquals(pageAddress.getHomePageUrl(), getCurrentAddress());
        ProductsPage productsPage = homePage.openProducts();
        productsPage.selectFirstProduct();
    }
}
