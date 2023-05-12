package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageObjects {

    @FindBy (xpath = "//*[@class='breadcrumb']//*[contains(text(), 'Shopping Cart')]")
    private WebElement cartHeader;

    @FindBy (xpath = "//*[contains(text(), 'Proceed To Checkout')]")
    private WebElement proceedToCheckoutBtn;

    @FindBy (xpath = "//*[@class='cart_description']//h4")
    private WebElement productName;

    @FindBy (xpath = "//*[@class='cart_quantity']//button")
    private WebElement productQuantity;

    @FindBy (xpath = "//*[@class='cart_price']//p")
    private WebElement productPrice;

    @FindBy (xpath = "//*[@class='cart_total']//p")
    private WebElement productTotalPrice;

    @FindBy (xpath = "//*[@class='cart_quantity_delete']")
    private WebElement removeItemFromCart;


    public WebElement getCartHeader() {
        return cartHeader;
    }

    public WebElement getProceedToCheckoutBtn() {
        return proceedToCheckoutBtn;
    }

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getProductQuantity() {
        return productQuantity;
    }

    public WebElement getProductPrice() {
        return productPrice;
    }

    public WebElement getProductTotalPrice() {
        return productTotalPrice;
    }

    public WebElement getRemoveItemFromCart() {
        return removeItemFromCart;
    }
}
