package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.SignUpPageLocators;

import java.time.Duration;

public class SignupPage extends BasePage{

    private SignUpPageLocators signupElements;

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public void waitUntilSignupLabelIsVisible() {
        WebElement signupLabel = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(signupElements.getSignupLabel()));

    }

    public void newUser(String name, String password) {
        signupElements.getSignupNameField().sendKeys(name);
        signupElements.getSignupEmailField().sendKeys(password);
        signupElements.getSignupButton().click();
    }
}
