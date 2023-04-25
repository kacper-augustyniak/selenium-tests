package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NavigationBar {

    @FindBy(className = ".logo.pull-left")
    public WebElement logoButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Home')]")
    public WebElement homeButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Products')]")
    public WebElement productsButton;


    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Cart')]")
    public WebElement cartButton;


    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Signup / Log in')]")
    public WebElement signupLoginButton;


    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Test Cases')]")
    public WebElement testCasesButton;


    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'API Testing')]")
    public WebElement apiTestingButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Video tutorials')]")
    public WebElement tutorialsButton;

    @FindBy(xpath = "//*[@class='shop-menu pull-right']//*[contains(text(), 'Contact us')]")
    public WebElement contactButton;


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
}
