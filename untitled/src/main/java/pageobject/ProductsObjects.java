package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ProductsObjects {


    @FindBy (xpath = "//*[@class='features_items']//*[contains(text(), 'All Products')]")
    public WebElement header;

//    ???
    @FindBy (className = "col-sm-4")
    public WebElement productsList;

//    ???
    @FindBy (className = "product-image-wrapper choose fa")
    private WebElement viewProductbtn;

    public WebElement getHeader() {
        return header;
    }

    public WebElement getProductsList() {
        return productsList;
    }
}
