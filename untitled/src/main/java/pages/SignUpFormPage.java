package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.SignUpFormElements;

import java.time.Duration;

public class SignUpFormPage extends BasePage {

    private SignUpFormElements abc;

    public SignUpFormPage(WebDriver driver) {
        super(driver);
        abc = new SignUpFormElements();
    }

    public void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait waitFor = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitFor.until(ExpectedConditions.visibilityOf(element));
    }




}
