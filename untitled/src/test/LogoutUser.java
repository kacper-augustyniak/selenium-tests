import address.PageAddress;
import org.testng.annotations.Test;
import pageobject.NavigationBarObjects;
import pageobject.SignUpPageObjects;
import pages.HomePage;
import pages.SignupPage;

import static org.testng.AssertJUnit.*;

public class LogoutUser extends BaseTest {

    private PageAddress pageAddress;
    private String emailAddress = "qwerty001@abc.pl";
    private String password = "qwerty001";
    private String username = "qwerty001";

    // functional
    @Test
    public void logoutUser() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilLoginPageHeaderIsVisible();
        signupPage.newLogin(emailAddress, password);
        HomePage loggedUserHomePage = signupPage.submitLogin();
        loggedUserHomePage.waitUntilLoggedUserIsVisible(); // string for logged user is visible except username
        assertEquals(homePage.getLoggedInUsername(), username);
        SignupPage signupPage2 = loggedUserHomePage.logoutUser();
        assertTrue(signupPage2.checkSignUpLoginUrl());
        assertFalse(signupPage2.loggedUserInfoPresent()); // element should not be present at all times - method written with try/catch
    }
}
