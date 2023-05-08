package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ContactUsFormPageObjects {

    @FindBy (xpath = "//*[@class='contact-form']//*[contains(text(), 'Get In Touch')]")
    private WebElement header;

    @FindBy (xpath = "//*[@id='form-section']//*[@name='name']")
    private WebElement name;
    @FindBy (xpath = "//*[@id='form-section']//*[@name='email']")
    private WebElement email;
    @FindBy (xpath = "//*[@id='form-section']//*[@name='subject']")
    private WebElement subject;
    @FindBy (xpath = "//*[@id='form-section']//*[@name='message']")
    private WebElement message;

    @FindBy (xpath = "//*[@id='form-section']//*[@name='upload_file']")
    private WebElement uploadFile;
    @FindBy (xpath = "//*[@id='form-section']//*[@name='submit']")
    private WebElement submitBtn;

    @FindBy (xpath = "//*[@class='contact-form']//*[@class='status alert alert-success']")
    private WebElement submittedWithSuccess;

    @FindBy (xpath = "//*[@id='form-section']//*[@class='btn btn-success']")
    private WebElement returnToHomePage;

    public WebElement getHeader() {
        return header;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getSubject() {
        return subject;
    }

    public WebElement getMessage() {
        return message;
    }

    public WebElement getUploadFile() {
        return uploadFile;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }

    public WebElement getSubmittedWithSuccess() {
        return submittedWithSuccess;
    }

    public WebElement getReturnToHomePage() {
        return returnToHomePage;
    }
}
