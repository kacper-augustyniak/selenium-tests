import address.PageAddress;
import org.testng.annotations.Test;
import pageobject.SignUpPageObjects;
import pages.HomePage;
import pages.SignupPage;
import static org.testng.AssertJUnit.*;


import java.util.Random;

public class LoginUserFail extends BaseTest {

    private Random random = new Random();
    private SignUpPageObjects signUpPageObjects;
    private PageAddress pageAddress;
    private String emailAddress = "abc@abc.pl";
    private String password = "password" + random.nextInt();
    private String username = "username";

//    functional
    @Test
    public void LoginUserFail() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilLoginPageHeaderIsVisible();
        signupPage.newLogin(emailAddress, password);
        signupPage.submitLogin();
        assertTrue(signupPage.failedLoginErrorMessage());
        assertTrue(signupPage.checkSignUpLoginUrl());
    }
}
