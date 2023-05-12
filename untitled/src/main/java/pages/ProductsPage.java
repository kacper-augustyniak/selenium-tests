package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.ProductsObjects;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends BasePage{


    private ProductsObjects productsObjects;
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean productsPageHeaderIsVisible() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(productsObjects.getHeader()));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean productsListIsPresent() {
        List<WebElement> products;
        products = driver.findElements(By.xpath("//*[@class='features_items']//*[@class='col-sm-4']"));
        if(products.size() > 10 && products != null) {
            return true;
        } else {
            return false;
        }




    }

    public void productListIsPresent1(){
        WebElement products1 = driver.findElement(By.xpath("//*[@class='features_items']"));

        products1.findElement(By.xpath("//*[@class='col-sm-4']"));

    }


//    ???
    public SingleProductPage viewProductFromList(int productNumber) {
        List<WebElement> products = driver.findElements(By.className("col-sm-4"));
//        view Product plus button is selected from DOM tree
        driver.findElement
                (By.xpath("//*[@class='col-sm-4'][" + productNumber +"]//*[@class='choose']//*[@class='fa fa-plus-square']"))
                .click();
        return new SingleProductPage(driver);
    }

    public void selectFirstProduct() throws InterruptedException {
//        scroll page so products are on top
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
//        hover over first product - image
        WebElement element = driver.findElement
                (By.xpath("//*[@class='features_items']//*[@class='col-sm-4'][1]"));
        Actions hover = new Actions(driver);
        hover.scrollToElement(element).moveToElement(element).perform();
//      click the button that appears after hover action above
        driver.findElement
                        (By.xpath("//*[@class='single-products']//*[@class='product-overlay']//*[@data-product-id='1']"))
                .click();
        Thread.sleep(3000);
    }

//    public SearchResultPage searchProduct(String name){
//        // akcja wpisania stringa name do inputu searchInput
//        // akcja kliknięcia na lupkę
//        return new SearchResultPage(driver);


}
