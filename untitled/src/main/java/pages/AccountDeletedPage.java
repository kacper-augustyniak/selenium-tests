package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.AccountDeletedPageObjects;

import java.time.Duration;

public class AccountDeletedPage extends BasePage {

    private AccountDeletedPageObjects accountDeletedPageObjects;

    public AccountDeletedPage(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageIsDisplayed() {
        waitForWebElement(accountDeletedPageObjects.getHeader());
    }

    public void continueDeletion() {
        accountDeletedPageObjects.getContinueBtn().click();
    }
}
