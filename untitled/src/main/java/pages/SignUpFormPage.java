package pages;

import address.PageAddress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.FooterObjects;
import pageobject.SignUpFormObjects;
import pageobject.SignUpPageObjects;

import java.time.Duration;

public class SignUpFormPage extends BasePage {

    private SignUpFormObjects signUpFormObjects;
    private FooterObjects footerObjects;
    private String env = "test";
    private PageAddress pageAddress;

    public SignUpFormPage(WebDriver driver) {
        super(driver);
        signUpFormObjects = new SignUpFormObjects(driver);
        pageAddress = new PageAddress(env, driver);
        footerObjects = new FooterObjects(driver);
    }

    public void waitUntilElementIsVisible(WebElement element) {
        waitForWebElement(element);
    }

    public void scrollToFooter(){
        scrollToElement(footerObjects.getFooter());
    }

    public void scrollToMobileNumber(){
        scrollToElement(signUpFormObjects.getMobile());
    }
    public boolean checkSignUpFormUrl() {
        return pageAddress.getSignupPageUrl().equalsIgnoreCase(driver.getCurrentUrl());
    }

    public void chooseTitle(String title) {
        switch (title) {
            case "Mrs":
                signUpFormObjects.getMrButton().click();
            case "Ms":
                signUpFormObjects.getMsButton().click();
        }
    }
    public void setPassword(String password) {
        signUpFormObjects.getPassword().click();
        signUpFormObjects.getPassword().sendKeys(password);
    }
    public void chooseDay(int day) {
        day += 1;
        signUpFormObjects.getDaysList().click();
        driver.findElement(By.xpath("//*[@id='days']/option[" + day + "]")).click();
//        WebElement getDropdown = signUpFormElements.getDaysList();
//        getDropdown.click();
//        List<WebElement> daysList = getDropdown.findElements(By.xpath("//*option"));
    }

    public void chooseMonth (int month) {
        month += 1;
        signUpFormObjects.getMonthsList().click();
        driver.findElement(By.xpath("//*[@id='months']/option[" + month + "]")).click();
    }

    public void chooseYear (int year) {
        signUpFormObjects.getYearsList().click();
        driver.findElement(By.xpath("//*[@id='years']/option[contains(text(), '" + year + "')]")).click();
    }


    // optymalizacja?
    public void chooseNwsletter(boolean active) {
        if (active) {
            if(!signUpFormObjects.getNewsletterChckbx().isSelected()) {
                signUpFormObjects.getNewsletterChckbx().click();
            }
        else {
            if (signUpFormObjects.getNewsletterChckbx().isSelected()) {
                signUpFormObjects.getNewsletterChckbx().click();

            }
            }
        }
    }

    public void chooseOffers(boolean active) {
            if (active) {
                if(!signUpFormObjects.getOffersChckbx().isSelected()) {
                    signUpFormObjects.getOffersChckbx().click();
                }
                else {
                    if (signUpFormObjects.getOffersChckbx().isSelected()) {
                        signUpFormObjects.getOffersChckbx().click();

                    }
                }
            }
    }

    public void setName(String firstName) {
        signUpFormObjects.getFirstName().click();
        signUpFormObjects.getFirstName().sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        signUpFormObjects.getLastName().click();
        signUpFormObjects.getLastName().sendKeys(lastName);
    }

    public void setCompany(String company) {
        signUpFormObjects.getCompany().click();
        signUpFormObjects.getCompany().sendKeys(company);
    }

    public void setAddress(String address) {
        signUpFormObjects.getAddress().click();
        signUpFormObjects.getAddress().sendKeys(address);
    }

    public void setAddress2(String address2) {
        signUpFormObjects.getAddress2().click();
        signUpFormObjects.getAddress2().sendKeys(address2);
    }

    public void setState(String state) {
        signUpFormObjects.getState().click();
        signUpFormObjects.getState().sendKeys(state);
    }

    public void setCity(String city) {
        signUpFormObjects.getCity().click();
        signUpFormObjects.getCity().sendKeys(city);
    }

    public void setZipcode(String zipcode) {
        signUpFormObjects.getZipcode().click();
        signUpFormObjects.getZipcode().sendKeys(zipcode);
    }

    public void setMobileNumber(String mobileNumber) {
        signUpFormObjects.getMobile().click();
        signUpFormObjects.getMobile().sendKeys(mobileNumber);
    }

    public void pickCountry(String countryName) {
        signUpFormObjects.getCountry().click();
        driver.findElement(By.xpath("//*[@id='country']//option[@value='" + countryName + "']")).click();
    }

    public AccountCreatedPage submitAccount() {
        signUpFormObjects.getCreateAccbtn().click();
        return new AccountCreatedPage(driver);
    }
    }
