package pages;

import org.openqa.selenium.WebDriver;
import pageobject.AccountDeletedPageObjects;


public class AccountDeletedPage extends BasePage {

    private AccountDeletedPageObjects accountDeletedPageObjects;

    public AccountDeletedPage(WebDriver driver) {
        super(driver);
        accountDeletedPageObjects = new AccountDeletedPageObjects(driver);
    }

    public void waitUntilPageIsDisplayed() {
        waitForWebElement(accountDeletedPageObjects.getHeader());
    }

    public void continueDeletion() {
        accountDeletedPageObjects.getContinueBtn().click();
    }
}
