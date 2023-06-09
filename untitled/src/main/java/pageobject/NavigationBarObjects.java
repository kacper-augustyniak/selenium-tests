package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


public class NavigationBarObjects extends BasePage {

    public NavigationBarObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = ".logo.pull-left")
    public WebElement logoButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Home')]")
    public WebElement homeButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Products')]")
    public WebElement productsButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Cart')]")
    public WebElement cartButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Signup / Login')]")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Test Cases')]")
    public WebElement testCasesButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'API Testing')]")
    public WebElement apiTestingButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Video tutorials')]")
    public WebElement tutorialsButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Contact us')]")
    public WebElement contactButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Logged in as')]")
    public WebElement loggedUser;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Logout')]")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Delete Account')]")
    public WebElement deleteAccountButton;

    public WebElement getLogoButton() {
        return logoButton;
    }

    public WebElement getHomeButton() {
        return homeButton;
    }

    public WebElement getProductsButton() {
        return productsButton;
    }

    public WebElement getCartButton() {
        return cartButton;
    }

    public WebElement getSignupLoginButton() {
        return signupLoginButton;
    }

    public WebElement getTestCasesButton() {
        return testCasesButton;
    }

    public WebElement getApiTestingButton() {
        return apiTestingButton;
    }

    public WebElement getTutorialsButton() {
        return tutorialsButton;
    }

    public WebElement getContactButton() {
        return contactButton;
    }

    public WebElement getLoggedUser() {
        return loggedUser;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getDeleteAccountButton() {
        return deleteAccountButton;
    }
}
