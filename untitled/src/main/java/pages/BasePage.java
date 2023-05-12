package pages;

import address.PageAddress;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.NavigationBarObjects;

import java.time.Duration;

public class BasePage {

    private String env = "test";
    protected WebDriver driver;
    private PageAddress pageAddress;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        pageAddress = new PageAddress(env, driver);
    }

    public void waitForWebElement(WebElement element) {
        WebDriverWait waitFor = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitFor.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.scrollToElement(element).perform();
    }

    public void checkPageUrl() {
//        pageAddress.
    }

}
