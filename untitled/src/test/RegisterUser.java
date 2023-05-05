import address.PageAddress;
import org.testng.annotations.Test;
import pageobject.NavigationBarObjects;
import pageobject.SignUpFormObjects;
import pageobject.SignUpPageObjects;
import pages.*;
import static org.testng.AssertJUnit.*;


public class RegisterUser extends BaseTest {

    // dlaczego init tu musi byc - poziom wyzej?
    // widocznosc elementu - .logo.pull-left - klasa nieznajdywalna
    private SignUpFormObjects signUpFormObjects = new SignUpFormObjects();
    private SignUpPageObjects signUpPageObjects;
    private NavigationBarObjects navigationBarObjects;
    private PageAddress pageAddress;

    @Test
    public void registerUser() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilElementIsVisible(signUpPageObjects.getSignupLabel());
        assertEquals(pageAddress.getSignupLoginPageUrl(), getCurrentAddress());
        signupPage.newUser("Adam Smith", "password1");
        SignUpFormPage signUpFormPage = signupPage.submitNewUser();
        assertEquals(pageAddress.getSignupPageUrl(), getCurrentAddress());
        signUpFormPage.chooseTitle("Ms");
        signUpFormPage.chooseDay(1);
        signUpFormPage.chooseMonth(1);
        signUpFormPage.chooseYear(2005);
        signUpFormPage.chooseNwsletter(true);
        signUpFormPage.chooseOffers(true);
        signUpFormPage.setName("John");
        signUpFormPage.setLastName("Smith");
        signUpFormPage.setCompany("Company XYZ");
        signUpFormPage.setAddress("St. Maria 1000 street");
        signUpFormPage.setAddress2("10/50 1st floor");
        signUpFormPage.pickCountry("India");
        signUpFormPage.setState("Georgia");
        signUpFormPage.setCity("Georgia Town");
        signUpFormPage.setZipcode("0000-0001");
        signUpFormPage.setMobileNumber("900800700");
        AccountCreatedPage accountCreatedPage = signUpFormPage.submitAccount();
        accountCreatedPage.waitUntilElementIsVisible();
        assertEquals(pageAddress.getAccountCreatedPageUrl(), getCurrentAddress());
        accountCreatedPage.continueRegistration();
        homePage.waitUntilElementIsVisible(navigationBarObjects.getLoggedUser());
        System.out.printf(homePage.getLoggedInUsername());
        AccountDeletedPage accountDeletedPage = homePage.deleteAccount();
        accountDeletedPage.waitUntilElementIsVisible();
        assertEquals(pageAddress.getAccountDeletedPageUrl(), getCurrentAddress());
        accountDeletedPage.continueDeletion();
    }
}
