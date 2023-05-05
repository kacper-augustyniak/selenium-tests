import org.testng.annotations.Test;
import pageobject.AccountDeletedPageObjects;
import pageobject.NavigationBar;
import pageobject.SignUpFormElements;
import pages.*;


public class Test01 extends BaseTest {

    // dlaczego init tu musi byc - poziom wyzej?
    // widocznosc elementu - .logo.pull-left - klasa nieznajdywalna
    private SignUpFormElements signUpFormElements = new SignUpFormElements();
    private NavigationBar navigationBar;

    @Test
    public void registerUser() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        SignupPage signupPage = homePage.registerOrLogInUser();
        signupPage.waitUntilElementIsVisible(signUpFormElements.getSignUpFormHeader());
        signupPage.newUser("Adam Smith", "password1");
        SignUpFormPage signUpFormPage = signupPage.submitNewUser();
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
        accountCreatedPage.continueRegistration();
        homePage.waitUntilElementIsVisible(navigationBar.getLoggedUser());
        System.out.printf(homePage.getLoggedInUsername());
        AccountDeletedPage accountDeletedPage = homePage.deleteAccount();
        accountDeletedPage.waitUntilElementIsVisible();
        accountDeletedPage.continueDeletion();
    }

    @Test
    public void sample() {
        driver.get("https://automationexcersice.com");
    }



//    ProductsPage productsPage = new ProductsPage(driver);
//    SearchResultPage searchResultPage = productsPage.searchProduct("dreees");
//        searchResultPage.validateResult("drees");
}
