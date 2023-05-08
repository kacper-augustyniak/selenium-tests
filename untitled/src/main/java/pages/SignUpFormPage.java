package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.SignUpFormObjects;

import java.time.Duration;

public class SignUpFormPage extends BasePage {

    private SignUpFormObjects signUpFormObjects;

    public SignUpFormPage(WebDriver driver) {
        super(driver);
        signUpFormObjects = new SignUpFormObjects();
    }

    public void waitUntilElementIsVisible(WebElement element) {
        waitForWebElement(element);
    }

    public void chooseTitle(String title) {
        switch (title) {
            case "Mrs":
                signUpFormObjects.getMrButton().click();
            case "Ms":
                signUpFormObjects.getMsButton().click();
        }
    }
    public void chooseDay(int day) {
        driver.findElement(By.xpath("//*[@id='days']//*[@value='" + day + "']")).click();
//        WebElement getDropdown = signUpFormElements.getDaysList();
//        getDropdown.click();
//        List<WebElement> daysList = getDropdown.findElements(By.xpath("//*option"));
    }

    public void chooseMonth (int month) {
        driver.findElement(By.xpath("//*[@id='months']//*[value='" + month + "']")).click();
    }

    public void chooseYear (int year) {
        driver.findElement(By.xpath("//*[@id='years']//*[value='" + year + "']")).click();
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
        signUpFormObjects.getZipcode().click();
        signUpFormObjects.getZipcode().sendKeys(mobileNumber);
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
