package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.AccountCreatedPageObjects;

import java.time.Duration;

public class AccountCreatedPage extends BasePage {
    
    private AccountCreatedPageObjects accountCreatedPageObjects;

    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageIsDisplayed() {
        waitForWebElement(accountCreatedPageObjects.getHeader());
    }

    public void continueRegistration() {
        accountCreatedPageObjects.getContinueBtn().click();
    }
}
