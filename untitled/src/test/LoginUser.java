import address.PageAddress;
import org.testng.annotations.Test;
import pageobject.NavigationBarObjects;
import pageobject.SignUpFormObjects;
import pageobject.SignUpPageObjects;
import pages.AccountDeletedPage;
import pages.HomePage;
import pages.SignupPage;
import static org.testng.AssertJUnit.*;

public class LoginUser extends BaseTest {
    private PageAddress pageAddress;

    private String emailAddress = "qwerty001@abc.pl";
    private String password = "qwerty";
    private String username = "qwerty";

    @Test
    public void loginUserWithCorrectCredentials() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilLoginPageHeaderIsVisible();
        signupPage.newLogin(emailAddress, password);
        HomePage loggedUserHomePage = signupPage.submitLogin();
        loggedUserHomePage.waitUntilLoggedUserIsVisible(); // string for logged user is visible except username
        assertEquals(homePage.getLoggedInUsername(), username);
        AccountDeletedPage accountDeletedPage = homePage.deleteAccount();
        accountDeletedPage.waitUntilPageIsDisplayed();
        assertTrue(homePage.checkHomePageUrl());
        accountDeletedPage.continueDeletion();
        }
}
