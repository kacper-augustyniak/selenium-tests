package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ProductsObjects {


    @FindBy (xpath = "//*[@class='features_items']//*[contains(text(), 'All Products')]")
    public WebElement header;

//    ???
    @FindBy (className = "col-sm-4")
    public WebElement productsList;

//    ???
    @FindBy (className = "product-image-wrapper choose fa")
    private WebElement viewProductbtn;

    @FindBy (xpath = "//button[contains(text(), 'Continue Shopping')]")
    private WebElement continueShoppingBtn;

    @FindBy (xpath = "//*[@class='modal-content']")
    private WebElement addedToCartAlert;

    @FindBy (xpath = "//*[@class='modal-content']//*[contains(text(), 'View Cart')]")
    private WebElement viewCart;

    public WebElement getHeader() {
        return header;
    }

    public WebElement getProductsList() {
        return productsList;
    }

    public WebElement getViewProductbtn() {
        return viewProductbtn;
    }

    public WebElement getContinueShoppingBtn() {
        return continueShoppingBtn;
    }

    public WebElement getAddedToCartAlert() {
        return addedToCartAlert;
    }

    public WebElement getViewCart() {
        return viewCart;
    }
}
