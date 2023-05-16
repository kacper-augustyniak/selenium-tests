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
    private String username = "qwerty001";
    private String emailAddress = "qwerty001@abc.pl";

    // functional
    @Test
    public void registerUserWithOldCreds() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilSignUpLabelIsVisible();
        assertTrue(signupPage.checkSignUpLoginUrl());
        signupPage.newUser(username, emailAddress);
        signupPage.submitNewUser();
        assertTrue(signupPage.failedSignupErrorMessage());
    }
}
