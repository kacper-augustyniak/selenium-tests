package pages;

import address.PageAddress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.CategorySideBarObjects;
import pageobject.NavigationBarObjects;
import pageobject.FooterObjects;
import pageobject.PopupObjects;

import static org.testng.AssertJUnit.*;

import java.time.Duration;

public class HomePage extends BasePage {

    private String env = "test";

    private CategorySideBarObjects categorySideBarObjects;
    private NavigationBarObjects navigationBarObjects;

    private FooterObjects footerObjects;
    private PageAddress pageAddress;

    private PopupObjects popupObjects;


    public HomePage(WebDriver driver) {
        super(driver);
        navigationBarObjects = new NavigationBarObjects(driver);
        footerObjects = new FooterObjects(driver);
        pageAddress = new PageAddress(env, driver);
    }

    public HomePage launchPage() {
        navigationBarObjects.getLogoButton().click();
        return new HomePage(driver);
    }

    public boolean checkHomePageUrl() {
        return pageAddress.getHomePageUrl() == driver.getCurrentUrl();
    }

    public void waitUntilHomePageVisible() {
        WebElement logoIsVisible = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".logo.pull-left"))));
        WebElement carouselAd = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".carousel-inner"))));
        assertEquals(logoIsVisible.isDisplayed(), true);
        assertEquals(carouselAd.isDisplayed(), true);
    }

    public void waitUntilLoggedUserIsVisible() {
        waitForWebElement(navigationBarObjects.getLoggedUser());
    }
    public SignupPage registerOrLogInUser() {
        navigationBarObjects.getSignupLoginButton().click();
        return new SignupPage(driver);
    }

    public String getLoggedInUsername() {
        String loggedUsername = navigationBarObjects.getLoggedUser().getText();
//        remove 'Logged in as..." part
        String selectUsername = loggedUsername.substring(13);
        return selectUsername;
    }

    public AccountDeletedPage deleteAccount() {
        navigationBarObjects.getDeleteAccountButton().click();
        return new AccountDeletedPage(driver);
    }

    public HomePage logoutUser() {
        navigationBarObjects.getLogoutButton().click();
        return new HomePage(driver);
    }

    public ContactUsFormPage openContactUsForm() {
        navigationBarObjects.getContactButton().click();
        return new ContactUsFormPage(driver);
    }

    public TestCasesPage openTestCases() {
        navigationBarObjects.testCasesButton.click();
        return new TestCasesPage(driver);
    }

    public CartPage openCart() {
        navigationBarObjects.getCartButton().click();
        return new CartPage(driver);
    }

    public ProductsPage openProducts() throws InterruptedException {
        navigationBarObjects.getProductsButton().click();
        Thread.sleep(5000);
        if (pageAddress.getAdvertisementPageUrl() == driver.getCurrentUrl())
            try {
            popupObjects.getDismissAdBtn().click();
            } catch (Exception e) {
                System.out.println("Advertisement could not be closed with msg");
                e.printStackTrace();
            }
        return new ProductsPage(driver);
    }

    public HomePage scrollFooterIntoView(){
        scrollToElement(footerObjects.getFooter());
        return new HomePage(driver);
    }

    public void createSubscription(String email) {
        footerObjects.getEmailToSubscribe().sendKeys(email);
        footerObjects.getSubscribeBtn();
    }

    public boolean loggedUserInfoPresent() {
        return navigationBarObjects.getLoggedUser().isDisplayed();
    }
}
