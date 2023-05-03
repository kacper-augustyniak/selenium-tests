package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPageElements {

//    public SignUpPageElements(WebDriver driver) {
//        super(driver);
//    }

    @FindBy (xpath = "//form[@action=\"/login\"]//input[@type=\"email\"]")
    private WebElement loginField;

    @FindBy (xpath = "//form[@action=\"/login\"]//input[@type=\"password\"]")
    private WebElement loginPasswordField;

    @FindBy (xpath = "//form[@action=\"/signup\"]//input[@type=\"text\"]")
    private WebElement signupNameField;

    @FindBy (xpath = "//form[@action=\"/signup\"]//input[@type=\"email\"]")
    private WebElement signupEmailField;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement signupButton;

    @FindBy(xpath = "//*[@class='signup-form']//*[contains(text(), 'New User Signup!')]")
    private WebElement signupLabel;

    public WebElement getLoginField() {
        return loginField;
    }

    public WebElement getLoginPasswordField() {
        return loginPasswordField;
    }

    public WebElement getSignupNameField() {
        return signupNameField;
    }

    public WebElement getSignupEmailField() {
        return signupEmailField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getSignupButton() {
        return signupButton;
    }

    public WebElement getSignupLabel() {
        return signupLabel;
    }
}
