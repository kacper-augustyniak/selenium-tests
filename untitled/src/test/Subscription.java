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

    // both functional

    @Test
    public void subscription() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        assertTrue(homePage.checkHomePageUrl());
        homePage.scrollFooterIntoView();
//        assertTrue(footerObjects.getSubscriptionHeader().isDisplayed());
        homePage.createSubscription(emailAddress);
        homePage.waitUntilSubscriptionAlertIsVisible();
    }

    @Test
    public void subscriptionCart() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        assertTrue(homePage.checkHomePageUrl());
        homePage.openCart();
        homePage.scrollFooterIntoView();
//        assertEquals(footerObjects.getSubscriptionHeader().getText(), "SUBSCRIPTION");
        homePage.createSubscription(emailAddress);
        homePage.waitUntilSubscriptionAlertIsVisible();
    }
}