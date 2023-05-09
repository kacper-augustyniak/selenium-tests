package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.SingleProductObjects;

public class SingleProductPage extends BasePage {

    private SingleProductObjects singleProductObjects;

    public SingleProductPage(WebDriver driver) {
        super(driver);
    }

    public void waitForProductToBeVisible() {
        waitForWebElement(singleProductObjects.getProductName());
    }
}
