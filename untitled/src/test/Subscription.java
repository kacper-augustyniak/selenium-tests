import address.PageAddress;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pageobject.FooterObjects;

import static org.testng.AssertJUnit.*;

public class Subscription extends BaseTest {

    private String env = "test";
    private String emailAddress = "abc@abc.com";
    private PageAddress pageAddress = new PageAddress(env, driver);
    private FooterObjects footerObjects = new FooterObjects(driver);

    @Test
    public void subscription() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        assertEquals(pageAddress.getHomePageUrl(), getCurrentAddress());
//        wywołanie obiektow na tym poziomie nie zadziala ??? trzeba ustawic na pozioie page'a
        homePage.scrollFooterIntoView();

//        assertEquals(footerObjects.getSubscriptionHeader().getText(), "SUBSCRIPTION");
        homePage.createSubscription(emailAddress);
        homePage.waitForWebElement(footerObjects.getSubscribedAlert());
    }

    @Test
    public void subscriptionCart() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        assertEquals(pageAddress.getHomePageUrl(), getCurrentAddress());
//        dziedziczenie? metory z homePage na cartPage w kontescie footera ???
        CartPage cartPage = homePage.openCart();
        homePage.scrollToElement(footerObjects.getFooter());
        assertEquals(footerObjects.getSubscriptionHeader().getText(), "SUBSCRIPTION");
        homePage.createSubscription(emailAddress);
        homePage.waitForWebElement(footerObjects.getSubscribedAlert());
    }
}