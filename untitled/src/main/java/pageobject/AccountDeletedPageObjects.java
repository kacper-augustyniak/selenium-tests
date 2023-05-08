package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDeletedPageObjects {

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
