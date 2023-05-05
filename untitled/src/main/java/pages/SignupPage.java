package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.SignUpPageObjects;

import java.time.Duration;

public class SignupPage extends BasePage{

    private SignUpPageObjects signupPageObjects;

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait waitFor = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitFor.until(ExpectedConditions.visibilityOf(element));
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
}
