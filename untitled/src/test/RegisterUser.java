import address.PageAddress;
import org.testng.annotations.Test;
import pageobject.NavigationBarObjects;
import pageobject.SignUpFormObjects;
import pageobject.SignUpPageObjects;
import pages.*;

import java.util.Random;

import static org.testng.AssertJUnit.*;


public class RegisterUser extends BaseTest {
    private PageAddress pageAddress;

    private Random random = new Random();

    private String username = random.nextInt(1, 10000) + "name";
    private String emailAddress = random.nextInt(1, 10000) + "@abc.com";

//    functional + popup not handled at final assertion...

    @Test
    public void registerUser() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilSignUpLabelIsVisible();
        assertTrue(signupPage.checkSignUpLoginUrl());
        signupPage.newUser(username, emailAddress);
        SignUpFormPage signUpFormPage = signupPage.submitNewUser();
        assertTrue(signUpFormPage.checkSignUpFormUrl());
        signUpFormPage.setPassword("qwerty");
        signUpFormPage.chooseTitle("Ms");
        signUpFormPage.chooseDay(5);
        signUpFormPage.chooseMonth(6);
        signUpFormPage.chooseYear(2005);
        signUpFormPage.chooseNwsletter(true);
        signUpFormPage.chooseOffers(true);
        signUpFormPage.scrollToMobileNumber();
        signUpFormPage.setName("John");
        signUpFormPage.setLastName("Smith");
        signUpFormPage.setCompany("Company XYZ");
        signUpFormPage.setAddress("St. Maria 1000 street");
        signUpFormPage.setAddress2("10/50 1st floor");
        signUpFormPage.pickCountry("Canada");
        signUpFormPage.setState("Georgia");
        signUpFormPage.setCity("Georgia Town");
        signUpFormPage.scrollToFooter();
        signUpFormPage.setZipcode("0000-0001");
        signUpFormPage.setMobileNumber("900800700");
        AccountCreatedPage accountCreatedPage = signUpFormPage.submitAccount();
        accountCreatedPage.waitUntilHeaderIsDisplayed();
        assertTrue(accountCreatedPage.checkAccountCreatedPageUrl());
        accountCreatedPage.continueRegistration();
        homePage.waitUntilLoggedUserIsVisible();
        AccountDeletedPage accountDeletedPage = homePage.deleteAccount();
        accountDeletedPage.waitUntilPageIsDisplayed();
        assertTrue(accountDeletedPage.checkAccountDeletedPageUrl());
        accountDeletedPage.continueDeletion();
    }
}
