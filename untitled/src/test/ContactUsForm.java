import address.PageAddress;
import org.testng.annotations.Test;
import pageobject.ContactUsFormPageObjects;
import pages.ContactUsFormPage;
import pages.HomePage;
import utils.WaitUtils;
import static org.testng.AssertJUnit.*;

public class ContactUsForm extends BaseTest {

    private WaitUtils wait = new WaitUtils(driver);
    private ContactUsFormPageObjects contactUsFormPageObjects = new ContactUsFormPageObjects(driver);
    private PageAddress pageAddress = new PageAddress(driver);

    private String filePath = "C:\\_dane\\foto\\IMG20221224200627.jpg";

    private String name = "John Smith";
    private String email = "johnsmith@email.com";
    private String subject = "Hello world";
    private String message = "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum ";


    @Test
    public void contactUsForm() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        ContactUsFormPage contactUsFormPage = homePage.openContactUsForm();
        wait.waitUntilElementIsVisible(contactUsFormPageObjects.getHeader());
        assertEquals(pageAddress.getContactUsPageUrl(), getCurrentAddress());
        contactUsFormPage.submitData(name, email, subject);
        contactUsFormPage.submitMessage(message);
        contactUsFormPage.uploadFile(filePath);
        contactUsFormPage.submitForm();
        contactUsFormPage.alertHandle(true);
        wait.waitUntilElementIsVisible(contactUsFormPageObjects.getSubmittedWithSuccess());
        contactUsFormPage.confirmAndReturnToHome();
        assertEquals(pageAddress.getHomePageUrl(), getCurrentAddress());
    }
}
