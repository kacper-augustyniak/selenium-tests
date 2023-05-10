package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingleProductObjects {

    @FindBy (xpath = "//*[@class='product-information']//h2")
    private WebElement productName;

    @FindBy (xpath = "//*[@class='product-information']//p[contains(text(), 'Category')]")
    private WebElement category;

    @FindBy (xpath = "")
    private WebElement availability;

    @FindBy (xpath = "")
    private WebElement condition;

    @FindBy (xpath = "")
    private WebElement brand;

//    //*[@class='product-information']//p/b/following-sibling::text() ???


    public WebElement getProductName() {
        return productName;
    }

    public WebElement getCategory() {
        return category;
    }

    public WebElement getAvailability() {
        return availability;
    }

    public WebElement getCondition() {
        return condition;
    }

    public WebElement getBrand() {
        return brand;
    }
}
