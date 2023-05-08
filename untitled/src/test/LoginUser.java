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

    private SignUpFormObjects signUpFormObjects;

    private SignUpPageObjects signUpPageObjects;
    private NavigationBarObjects navigationBarObjects;
    private PageAddress pageAddress;

    private String emailAddress = "qwerty001@abc.pl";
    private String password = "qwerty001";
    private String username = "qwerty001";
    @Test
    public void createNewUser() {

    }
    @Test
    public void loginUserWithCorrectCredentials() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilElementIsVisible(signUpPageObjects.getLoginPageHeader());
        signupPage.newLogin(emailAddress, password);
        HomePage loggedUserHomePage = signupPage.submitLogin();
//        string for logged user is visible except username
        loggedUserHomePage.waitUntilElementIsVisible(navigationBarObjects.getLoggedUser());
        assertEquals(homePage.getLoggedInUsername(), username);
        AccountDeletedPage accountDeletedPage = homePage.deleteAccount();
        accountDeletedPage.waitUntilPageIsDisplayed();
        assertEquals(pageAddress.getAccountDeletedPageUrl(), getCurrentAddress());
        accountDeletedPage.continueDeletion();
        }
}
