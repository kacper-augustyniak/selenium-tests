package pages;

import address.PageAddress;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.INavigatorPanel;
import pageobject.NavigationBarObjects;
import pageobject.SignUpPageObjects;

import java.time.Duration;

public class SignupPage extends BasePage{
    private String env = "test";
    private SignUpPageObjects signupPageObjects;
    private PageAddress pageAddress;
    private NavigationBarObjects navigationBarObjects;

    public SignupPage(WebDriver driver) {
        super(driver);
        signupPageObjects = new SignUpPageObjects(driver);
        pageAddress = new PageAddress(env, driver);
        navigationBarObjects = new NavigationBarObjects(driver);
    }

    public void waitUntilLoginPageHeaderIsVisible() {
        waitForWebElement(signupPageObjects.getLoginPageHeader());
    }

    public boolean checkSignUpLoginUrl() {
        return pageAddress.getSignupLoginPageUrl().equalsIgnoreCase(driver.getCurrentUrl());
    }

    public boolean loggedUserInfoPresent() {
        try {
            boolean loggedStatus = navigationBarObjects.getLoggedUser().isDisplayed();
            return loggedStatus;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean failedLoginErrorMessage() {
        WebDriverWait waitFor = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean errorIsVisible = waitFor.until(ExpectedConditions.visibilityOf(signupPageObjects.getFailedLoginErrorMsg())).isDisplayed();
        return errorIsVisible;
    }

    public boolean failedSignupErrorMessage() {
        WebDriverWait waitFor = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean errorIsVisible = waitFor.until(ExpectedConditions.visibilityOf(signupPageObjects.getFailedSignupErrorMsg())).isDisplayed();
        return errorIsVisible;
    }

    public void newUser(String name, String password) {
        signupPageObjects.getSignupNameField().sendKeys(name);
        signupPageObjects.getSignupEmailField().sendKeys(password);
    }

    public SignUpFormPage submitNewUser() {
        signupPageObjects.getSignupButton().click();
        return new SignUpFormPage(driver);
    }
    
    public void newLogin(String emailAddress, String password) {
        signupPageObjects.getLoginField().sendKeys(emailAddress);
        signupPageObjects.getLoginPasswordField().sendKeys(password);
    }
    
    public HomePage submitLogin() {
        signupPageObjects.getLoginButton().click();
        return new HomePage(driver);
    }

    public void waitUntilSignUpLabelIsVisible() {
        waitForWebElement(signupPageObjects.getSignupLabel());
    }

}
