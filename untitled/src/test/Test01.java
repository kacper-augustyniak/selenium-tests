import org.testng.annotations.Test;
import pageobject.NavigationBar;
import pageobject.SignUpFormElements;
import pages.HomePage;
import pages.SignUpFormPage;
import pages.SignupPage;


public class Test01 extends BaseTest {

    private NavigationBar navigationBar;
    private SignUpFormElements signUpFormElements;


    @Test
    public void registerUser() {
        navigationBar.signupLoginButton.click();
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        navigationBar.getSignupLoginButton().click();
        SignupPage signupPage = new SignupPage(driver);
        signupPage.waitUntilElementIsVisible(signUpFormElements.getSignUpFormHeader());
        signupPage.newUser("Adam Smith", "password1");
        SignUpFormPage signUpFormPage = signupPage.submitNewUser();
// days months years selectors
        signUpFormElements.getNewsletterChckbx().click();
        signUpFormElements.getOffersChckbx().click();



    }



//    ProductsPage productsPage = new ProductsPage(driver);
//    SearchResultPage searchResultPage = productsPage.searchProduct("dreees");
//        searchResultPage.validateResult("drees");
}
