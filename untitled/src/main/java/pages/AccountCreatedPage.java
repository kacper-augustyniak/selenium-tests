package pages;

import org.openqa.selenium.WebDriver;
import pageobject.AccountCreatedPageObjects;

public class AccountCreatedPage extends BasePage {
    
    private AccountCreatedPageObjects accountCreatedPageObjects;

    public AccountCreatedPage(WebDriver driver) {
        super(driver);
        accountCreatedPageObjects = new AccountCreatedPageObjects();
    }

    public void waitUntilHeaderIsDisplayed() {
        waitForWebElement(accountCreatedPageObjects.getHeader());
    }

    public void continueRegistration() {
        accountCreatedPageObjects.getContinueBtn().click();
    }
}
