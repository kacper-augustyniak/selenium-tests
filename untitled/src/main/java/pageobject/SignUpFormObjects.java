package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class SignUpFormElements {

    @FindBy (xpath = "//h2//*[contains(text(), 'Enter Account Information')]")
    private WebElement signUpFormHeader;

    @FindBy (id = "id_gender1")
    private WebElement mrButton;

    @FindBy (id = "id_gender2")
    private WebElement msButton;

    @FindBy (id = "password")
    private WebElement password;

    @FindBy (xpath = "//*[@id='days']")
    private WebElement daysList;

    @FindBy (id = "//*[@id='months']")

    private WebElement monthsList;

    @FindBy (id = "//*[@id='years']")

    private WebElement yearsList;

    @FindBy (id = "//*[@id='newsletter']")
    private WebElement newsletterChckbx;

    @FindBy (id = "//*[@id='optin']")
    private WebElement offersChckbx;

    @FindBy (id = "first_name")
    private WebElement firstName;

    @FindBy (id = "last_name")
    private WebElement lastName;

    @FindBy (id = "address1")
    private WebElement address;

    @FindBy (id = "address2")
    private WebElement address2;

    @FindBy (id = "country")
    private WebElement country;

    @FindBy (id = "company")
    private WebElement company;

    @FindBy (id = "city")
    private WebElement city;

    @FindBy (id = "state")
    private WebElement state;

    @FindBy (id = "zipcode")
    private WebElement zipcode;

    @FindBy (id = "mobile_number")
    private WebElement mobile;

    @FindBy (xpath = "//button[text()='Create Account']")
    private WebElement createAccbtn;


    public WebElement getSignUpFormHeader() {
        return signUpFormHeader;
    }

    public WebElement getMrButton() {
        return mrButton;
    }

    public WebElement getMsButton() {
        return msButton;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getDaysList() {
        return daysList;
    }

    public WebElement getMonthsList() {
        return monthsList;
    }

    public WebElement getYearsList() {
        return yearsList;
    }

    public WebElement getNewsletterChckbx() {
        return newsletterChckbx;
    }

    public WebElement getOffersChckbx() {
        return offersChckbx;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getAddress() {
        return address;
    }

    public WebElement getAddress2() {
        return address2;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getCompany() {
        return company;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getZipcode() {
        return zipcode;
    }

    public WebElement getMobile() {
        return mobile;
    }

    public WebElement getCreateAccbtn() {
        return createAccbtn;
    }
}
