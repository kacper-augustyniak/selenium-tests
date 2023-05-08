package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasesObjects {

    @FindBy(xpath = "//*[@class='panel-group']//h5//*[contains(text(), 'Below is the list of test Cases for you to practice the Automation.')]")
    public WebElement header;

    @FindBy(xpath = "//*[@class='panel-group']//h4")
    public WebElement testCaseRow;

    public WebElement getHeader() {
        return header;
    }

    public WebElement getTestCaseRow() {
        return testCaseRow;
    }
}

