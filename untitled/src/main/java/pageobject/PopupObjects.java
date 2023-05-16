package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class PopupObjects extends BasePage {

    public PopupObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id='mys-wrapper']")
    private WebElement adPopup;

    @FindBy (xpath = "//*[@id='dismiss-button']")
    private WebElement dismissAdBtn;

    public WebElement getDismissAdBtn() {
        return dismissAdBtn;
    }

    public WebElement getAdPopup() {
        return adPopup;
    }
}
