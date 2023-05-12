package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertObjects {

    @FindBy (xpath = "//*[@id='dismiss-button']")
    private WebElement closePopupBtn;
}
