package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class WaitUtils {

    private WebDriver driver;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait elementIsVisible = new WebDriverWait(driver, Duration.ofSeconds(5));
        elementIsVisible.until(ExpectedConditions.visibilityOf(element));
        System.out.println("Element " + element.getText() + " loaded properly.");
    }
}
