package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AccountDeletedPageObjects extends BasePage {

    public AccountDeletedPageObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//h2//*[text()='Account Deleted!']")
    private WebElement header;

    @FindBy (xpath = "//*[contains(text(), 'Continue')]")
    private WebElement continueBtn;

    public WebElement getHeader() {
        return header;
    }

    public WebElement getContinueBtn() {
        return continueBtn;
    }
}
