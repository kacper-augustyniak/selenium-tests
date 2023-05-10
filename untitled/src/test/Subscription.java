import address.PageAddress;
import org.testng.annotations.Test;
import pages.HomePage;
import pagestructure.FooterObjects;

import static org.testng.AssertJUnit.*;

public class Subscription extends BaseTest {

    private String emailAddress = "abc@abc.com";
    private PageAddress pageAddress;
    private FooterObjects footerObjects;

    @Test
    public void subscription() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        assertEquals(pageAddress.getHomePageUrl(), getCurrentAddress());
//        wywołanie obiektow na tym poziomie nie zadziala ??? trzeba ustawic na pozioie page'a
        homePage.scrollToElementById(footerObjects.getFooter());
        assertEquals(footerObjects.getSubscriptionHeader().getText(), "SUBSCRIPTION");
        homePage.createSubscription(emailAddress);
        homePage.waitForWebElement(footerObjects.getSubscribedAlert());
    }
}