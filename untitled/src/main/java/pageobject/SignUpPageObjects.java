package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPageObjects {

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

    @FindBy (xpath = "//*[@class='login-form']//*[contains(text(), 'Login to your account')]")
    private WebElement loginPageHeader;

    @FindBy(xpath = "//*[@class='signup-form']//*[contains(text(), 'New User Signup!')]")
    private WebElement signupLabel;

    @FindBy(xpath = "//*[@class='login-form']//*[contains(text(), 'Your email or password is incorrect!')]")
    private WebElement failedLoginErrorMsg;

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

    public WebElement getLoginPageHeader() {
        return loginPageHeader;
    }

    public WebElement getSignupLabel() {
        return signupLabel;
    }

    public WebElement getFailedLoginErrorMsg() {
        return failedLoginErrorMsg;
    }
}
