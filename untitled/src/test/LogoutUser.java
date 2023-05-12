import address.PageAddress;
import org.testng.annotations.Test;
import pageobject.NavigationBarObjects;
import pageobject.SignUpPageObjects;
import pages.HomePage;
import pages.SignupPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;

public class LogoutUser extends BaseTest {

    private PageAddress pageAddress;
    private String emailAddress = "qwerty001@abc.pl";
    private String password = "qwerty001";
    private String username = "qwerty001";

    @Test
    public void logoutUser() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilLoginPageHeaderIsVisible();
        signupPage.newLogin(emailAddress, password);
        HomePage loggedUserHomePage = signupPage.submitLogin();
//        string for logged user is visible except username
        loggedUserHomePage.waitUntilLoggedUserIsVisible();
        assertEquals(homePage.getLoggedInUsername(), username);
        loggedUserHomePage.logoutUser();
        loggedUserHomePage.waitUntilHomePageVisible();
        assertEquals(pageAddress.getHomePageUrl(), getCurrentAddress());
        assertFalse(loggedUserHomePage.loggedUserInfoPresent());
    }
}
