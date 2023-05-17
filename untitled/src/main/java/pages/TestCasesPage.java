package pages;

import address.PageAddress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.TestCasesObjects;

import java.util.ArrayList;
import java.util.List;

public class TestCasesPage extends BasePage {

    private TestCasesObjects testCasesObjects;
    public TestCasesPage(WebDriver driver) {
        super(driver);
        testCasesObjects = new TestCasesObjects(driver);
    }

    public void waitForTestCasesHeader() {
        waitForWebElement(testCasesObjects.getHeader());
    }

    public boolean collectQuantityOfTestCases() {
        List<WebElement> testCases = new ArrayList<>();
        testCases = driver.findElements(By.xpath("//*[@class='panel-title']//*[contains(text(), 'Test Case')]"));
        return testCases.size() == 26;
    }
}
