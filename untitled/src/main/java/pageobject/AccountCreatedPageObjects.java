package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPageObjects {

    @FindBy (xpath = "//h2//*[text()='Account Created!']")
    private WebElement header;
}
