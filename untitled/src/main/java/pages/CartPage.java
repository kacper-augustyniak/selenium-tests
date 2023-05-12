package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.CartPageObjects;

import java.util.List;
import java.util.stream.Collectors;

public class CartPage extends BasePage {

    private CartPageObjects cartPageObjects;

    public CartPage(WebDriver driver) {
        super(driver);
        cartPageObjects = new CartPageObjects();
    }

    public void compareAddedProductsWithCart(List<String> productDetails, int productIndex) {
        if (productIndex == 1) {
            List<String> fields = driver.findElements(By.xpath("//tr[" + productIndex + "]//td"))
                    .stream()
                    .skip(6)
                    .map(WebElement::getText)
                    .collect(Collectors.toList());
        } else {
            List<String> fields = driver.findElements(By.xpath("//tr[" + productIndex + "]//td"))
                    .stream()
                    .map(WebElement::getText)
                    .collect(Collectors.toList());
        }


    }
}
