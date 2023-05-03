package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.SignUpFormElements;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class SignUpFormPage extends BasePage {

    private SignUpFormElements signUpFormElements;

    public SignUpFormPage(WebDriver driver) {
        super(driver);
        signUpFormElements = new SignUpFormElements();
    }

    public void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait waitFor = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitFor.until(ExpectedConditions.visibilityOf(element));
    }

    public void chooseTitle(String title) {
        switch (title) {
            case "Mrs":
                signUpFormElements.getMrButton().click();
            case "Ms":
                signUpFormElements.getMsButton().click();
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
            if(!signUpFormElements.getNewsletterChckbx().isSelected()) {
                signUpFormElements.getNewsletterChckbx().click();
            }
        else {
            if (signUpFormElements.getNewsletterChckbx().isSelected()) {
                signUpFormElements.getNewsletterChckbx().click();

            }
            }
        }
    }

    public void chooseOffers(boolean active) {
            if (active) {
                if(!signUpFormElements.getOffersChckbx().isSelected()) {
                    signUpFormElements.getOffersChckbx().click();
                }
                else {
                    if (signUpFormElements.getOffersChckbx().isSelected()) {
                        signUpFormElements.getOffersChckbx().click();

                    }
                }
            }
    }

    public void setName(String firstName) {
        signUpFormElements.getFirstName().click();
        signUpFormElements.getFirstName().sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        signUpFormElements.getLastName().click();
        signUpFormElements.getLastName().sendKeys(lastName);
    }

    public void setCompany(String company) {
        signUpFormElements.getCompany().click();
        signUpFormElements.getCompany().sendKeys(company);
    }

    public void setAddress(String address) {
        signUpFormElements.getAddress().click();
        signUpFormElements.getAddress().sendKeys(address);
    }

    public void setAddress2(String address2) {
        signUpFormElements.getAddress2().click();
        signUpFormElements.getAddress2().sendKeys(address2);
    }

    public void setState(String state) {
        signUpFormElements.getState().click();
        signUpFormElements.getState().sendKeys(state);
    }

    public void setCity(String city) {
        signUpFormElements.getCity().click();
        signUpFormElements.getCity().sendKeys(city);
    }

    public void setZipcode(String zipcode) {
        signUpFormElements.getZipcode().click();
        signUpFormElements.getZipcode().sendKeys(zipcode);
    }

    public void setMobileNumber(String mobileNumber) {
        signUpFormElements.getZipcode().click();
        signUpFormElements.getZipcode().sendKeys(mobileNumber);
    }

    public void pickCountry(String countryName) {
        signUpFormElements.getCountry().click();
        driver.findElement(By.xpath("//*[@id='country']//option[@value='" + countryName + "']")).click();
    }

    public AccountCreatedPage submitAccount() {
        signUpFormElements.getCreateAccbtn().click();
        return new AccountCreatedPage(driver);
    }
    }
