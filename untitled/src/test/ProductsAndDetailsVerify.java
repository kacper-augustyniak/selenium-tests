import address.PageAddress;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import pages.SingleProductPage;
import utils.WaitUtils;

import static org.testng.AssertJUnit.*;

public class ProductsAndDetailsVerify extends BaseTest {

    private ProductsPage productsPage;
    private PageAddress pageAddress;
    private WaitUtils waitUtils;

    @Test
    public void productsVerify() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        productsPage = homePage.openProducts();
        assertEquals(pageAddress.getProductsPageUrl(), getCurrentAddress());
        assertTrue(productsPage.productsPageHeaderIsVisible());
        assertTrue(productsPage.productsListIsPresent());
        SingleProductPage singleProductPage = productsPage.viewProductFromList(1);
        singleProductPage.waitForProductToBeVisible();
//      verify objects for avail, cond, brand TBD
    }
}