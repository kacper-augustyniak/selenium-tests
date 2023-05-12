import address.PageAddress;
import org.testng.annotations.Test;
import pageobject.NavigationBarObjects;
import pageobject.SignUpPageObjects;
import pages.HomePage;
import pages.SignupPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;

public class LogoutUser extends BaseTest {

    private SignUpPageObjects signUpPageObjects = new SignUpPageObjects();
    private NavigationBarObjects navigationBarObjects;
    private PageAddress pageAddress;

    private String emailAddress = "qwerty001@abc.pl";
    private String password = "qwerty001";
    private String username = "qwerty001";

    @Test
    public void logoutUser() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilElementIsVisible(signUpPageObjects.getLoginPageHeader());
        signupPage.newLogin(emailAddress, password);
        HomePage loggedUserHomePage = signupPage.submitLogin();
//        string for logged user is visible except username
        loggedUserHomePage.waitUntilElementIsVisible(navigationBarObjects.getLoggedUser());
        assertEquals(homePage.getLoggedInUsername(), username);
        loggedUserHomePage.logoutUser();
        loggedUserHomePage.waitUntilHomePageVisible();
        assertEquals(pageAddress.getHomePageUrl(), getCurrentAddress());
        assertFalse(navigationBarObjects.getLoggedUser().isDisplayed());
    }
}
