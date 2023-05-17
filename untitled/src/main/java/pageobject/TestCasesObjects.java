package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TestCasesObjects extends BasePage {

    public TestCasesObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='panel-group']//h5//*[contains(text(), 'Below is the list of test Cases for you to practice the Automation.')]")
    public WebElement header;

    @FindBy(xpath = "//*[@class='panel-title']//*[contains(text(), 'Test Case')]")
    public WebElement testCaseRow;

    public WebElement getHeader() {
        return header;
    }

    public WebElement getTestCaseRow() {
        return testCaseRow;
    }
}

