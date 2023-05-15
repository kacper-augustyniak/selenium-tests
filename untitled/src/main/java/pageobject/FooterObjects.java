package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class FooterObjects extends BasePage {

    public FooterObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "footer")
    private WebElement footer;

    @FindBy (xpath = "//footer//h2")
    private WebElement subscriptionHeader;

    @FindBy (id = "subscribe_email")
    private WebElement emailToSubscribe;

    @FindBy (id = "subscribe")
    private WebElement subscribeBtn;

    @FindBy (id = "success-subscribe")
    private WebElement subscribedAlert;

    @FindBy (xpath = "//footer/div[2]/div/div/p")
    private WebElement copyrights;

    public WebElement getFooter() {
        return footer;
    }

    public WebElement getSubscriptionHeader() {
        return subscriptionHeader;
    }

    public WebElement getEmailToSubscribe() {
        return emailToSubscribe;
    }

    public WebElement getSubscribeBtn() {
        return subscribeBtn;
    }

    public WebElement getSubscribedAlert() {
        return subscribedAlert;
    }

    public WebElement getCopyrights() {
        return copyrights;
    }


}
