import address.PageAddress;
import org.testng.annotations.Test;
import pageobject.SignUpPageObjects;
import pages.HomePage;
import pages.SignupPage;
import static org.testng.AssertJUnit.*;


import java.util.Random;

public class LoginUserFail extends BaseTest {

    private Random random;
    private SignUpPageObjects signUpPageObjects;
    private PageAddress pageAddress;
    private String emailAddress = "abc@abc.pl";
    private String password = "password" + random.nextInt();
    private String username = "username";

    @Test
    public void LoginUserFail() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilElementIsVisible(signUpPageObjects.getLoginPageHeader());
        signupPage.newLogin(emailAddress, password);
        HomePage loggedUserHomePage = signupPage.submitLogin();
        assertTrue(signupPage.failedLoginErrorMessage());
        assertEquals(pageAddress.getSignupLoginPageUrl(), getCurrentAddress());
    }
}
