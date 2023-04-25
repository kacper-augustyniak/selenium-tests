import org.testng.annotations.Test;
import pageobject.NavigationBar;
import pages.HomePage;
import pages.SignupPage;


public class Test01 extends BaseTest {

    private NavigationBar navigationBar;


    @Test
    public void registerUser() {
        navigationBar.signupLoginButton.click();
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        navigationBar.getSignupLoginButton().click();
        SignupPage signupPage = new SignupPage(driver);
        signupPage.waitUntilSignupLabelIsVisible();
        signupPage.newUser("Adam Smith", "password1");




    }



//    ProductsPage productsPage = new ProductsPage(driver);
//    SearchResultPage searchResultPage = productsPage.searchProduct("dreees");
//        searchResultPage.validateResult("drees");
}
