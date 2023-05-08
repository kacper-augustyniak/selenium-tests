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

    public void waitUntilElementIsVisible() {
        WebDriverWait elementIsVisible = new WebDriverWait(driver, Duration.ofSeconds(5));
        elementIsVisible.until(ExpectedConditions.visibilityOf(accountCreatedPageObjects.getHeader()));
        System.out.println("Element found properly.");
    }

    public void continueRegistration() {
        accountCreatedPageObjects.getContinueBtn().click();
    }
}
