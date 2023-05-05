package pages;

import address.PageAddress;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.CategorySideBar;
import pageobject.NavigationBar;

import java.time.Duration;

public class HomePage extends BasePage {

    private CategorySideBar categorySideBar;
    private NavigationBar navigationBar;
    private PageAddress pageAddress;


    public HomePage(WebDriver driver) {
        super(driver);
        navigationBar = new NavigationBar();
    }

    public HomePage launchPage() {
        navigationBar.getLogoButton().click();
        return new HomePage(driver);
    }

    public void waitUntilHomePageVisible() {
        WebElement logoIsVisible = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".logo.pull-left"))));
        WebElement carouselAd = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".carousel-inner"))));
        Assert.isTrue(logoIsVisible.isDisplayed(), "Logo is not visible yet!");
        Assert.isTrue(carouselAd.isDisplayed(), "Carousel Ad is not visible yet!");
    }

    public void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait elementIsVisible = new WebDriverWait(driver, Duration.ofSeconds(5));
        elementIsVisible.until(ExpectedConditions.visibilityOf(element));
        System.out.println("Element is loaded properly.");
    }

    public SignupPage registerOrLogInUser() {
        navigationBar.signupLoginButton.click();
        return new SignupPage(driver);
    }

    public String getLoggedInUsername() {
        String loggedUsername = navigationBar.getLoggedUser().getText();
//        remove 'Logged in as..." part
        String selectUsername = loggedUsername.substring(13);
        return selectUsername;
    }

    public AccountDeletedPage deleteAccount() {
        navigationBar.getDeleteAccountButton().click();
        return new AccountDeletedPage(driver);
    }

    public SubPage chooseManCategory(int type) {
        categorySideBar.getMenButton().click();
        switch (type) {
            case 1:
                categorySideBar.getMenTshirtsButton().click();
            case 2:
                categorySideBar.getMenJeansButton().click();

        }
        return new SubPage(driver);
    }

//    public SubPage chooseBrand(int value) {
//
//        return SubPage;
//    }

}
