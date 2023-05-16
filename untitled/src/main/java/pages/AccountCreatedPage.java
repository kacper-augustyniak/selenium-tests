package pages;

import address.PageAddress;
import org.openqa.selenium.WebDriver;
import pageobject.AccountCreatedPageObjects;

public class AccountCreatedPage extends BasePage {
    
    private AccountCreatedPageObjects accountCreatedPageObjects;

    private String env = "test";
    private PageAddress pageAddress;

    public AccountCreatedPage(WebDriver driver) {
        super(driver);
        accountCreatedPageObjects = new AccountCreatedPageObjects(driver);
        pageAddress = new PageAddress(env, driver);
    }

    public void waitUntilHeaderIsDisplayed() {
        waitForWebElement(accountCreatedPageObjects.getHeader());
    }

    public boolean checkAccountCreatedPageUrl() {
        return pageAddress.getAccountCreatedPageUrl().equalsIgnoreCase(driver.getCurrentUrl());
    }

    public void continueRegistration() {
        accountCreatedPageObjects.getContinueBtn().click();
    }
}
