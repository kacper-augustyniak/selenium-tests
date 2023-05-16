package pages;

import address.PageAddress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.ContactUsFormPageObjects;

import java.time.Duration;

public class ContactUsFormPage extends BasePage {

    private String env = "test";
    private ContactUsFormPageObjects contactUsFormPageObjects;
    private PageAddress pageAddress;

    public ContactUsFormPage(WebDriver driver) {
        super(driver);
        contactUsFormPageObjects = new ContactUsFormPageObjects(driver);
        pageAddress = new PageAddress(env, driver);
    }

    public void waitUntilContactUsPageIsVisible() {
        waitForWebElement(contactUsFormPageObjects.getHeader());
    }

    public boolean checkContactUsFormUrl() {
        return pageAddress.getContactUsPageUrl().equalsIgnoreCase(driver.getCurrentUrl());
    }

    public void checkSubmittedStatusIsSuccess() {
        waitForWebElement(contactUsFormPageObjects.getSubmittedWithSuccess());
    }

    public void submitData(String name, String email, String subject) {
        contactUsFormPageObjects.getName().sendKeys(name);
        contactUsFormPageObjects.getEmail().sendKeys(email);
        contactUsFormPageObjects.getSubject().sendKeys(subject);
    }

    public void submitMessage(String message) {
        contactUsFormPageObjects.getMessage().sendKeys(message);
    }

    public void uploadFile(String pathToFile) {
        contactUsFormPageObjects.getUploadFile().clear();
        contactUsFormPageObjects.getUploadFile().sendKeys(pathToFile);
    }

    public void submitForm() {
        contactUsFormPageObjects.getSubmitBtn().click();
    }

    public void alertHandle(boolean proceed) {
        if (proceed) {
            driver.switchTo().alert().accept();

        } else {
            driver.switchTo().alert().dismiss();
        }
    }
    public HomePage confirmAndReturnToHome() {
        contactUsFormPageObjects.getReturnToHomePage().click();
        return new HomePage(driver);
    }

}
