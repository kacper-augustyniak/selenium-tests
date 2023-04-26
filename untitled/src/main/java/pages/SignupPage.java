package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.SignUpPageElements;

import java.time.Duration;

public class SignupPage extends BasePage{

    private SignUpPageElements signupElements;

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait waitFor = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitFor.until(ExpectedConditions.visibilityOf(element));

    }

    public void newUser(String name, String password) {
        signupElements.getSignupNameField().sendKeys(name);
        signupElements.getSignupEmailField().sendKeys(password);
    }

    public SignUpFormPage submitNewUser() {
        signupElements.getSignupButton().click();
        return new SignUpFormPage(driver);
    }
}
