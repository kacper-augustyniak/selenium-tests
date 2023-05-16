package pages;

import address.PageAddress;
import org.openqa.selenium.WebDriver;
import pageobject.AccountDeletedPageObjects;


public class AccountDeletedPage extends BasePage {

    private AccountDeletedPageObjects accountDeletedPageObjects;

    private String env = "test";
    private PageAddress pageAddress;

    public AccountDeletedPage(WebDriver driver) {
        super(driver);
        accountDeletedPageObjects = new AccountDeletedPageObjects(driver);
        pageAddress = new PageAddress(env, driver);
    }

    public void waitUntilPageIsDisplayed() {
        waitForWebElement(accountDeletedPageObjects.getHeader());
    }

    public boolean checkAccountDeletedPageUrl() {
        return pageAddress.getHomePageUrl().equalsIgnoreCase(driver.getCurrentUrl());
    }

    public void continueDeletion() {
        accountDeletedPageObjects.getContinueBtn().click();
    }
}
