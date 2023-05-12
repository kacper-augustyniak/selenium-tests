import address.PageAddress;
import org.testng.annotations.Test;
import pageobject.SignUpPageObjects;
import pages.HomePage;
import pages.SignupPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class RegisterUserWithOldCredentials extends BaseTest {

    private SignUpPageObjects signUpPageObjects;
    private PageAddress pageAddress;
    private String username;
    private String emailAddress;
    @Test
    public void registerUserWithOldCreds() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilSignUpLabelIsVisible();
        assertEquals(pageAddress.getSignupLoginPageUrl(), getCurrentAddress());
        signupPage.newUser(username, emailAddress);
        signupPage.submitNewUser();
        assertEquals(pageAddress.getSignupPageUrl(), getCurrentAddress());
        assertTrue(signupPage.failedSignupErrorMessage());
    }
}
