package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    // lokatory
    @FindBy(xpath = "")
    private WebElement searchInput;


    //akcja biznesowya wyszukiwania

    public SearchResultPage searchProduct(String name){
        // akcja wpisania stringa name do inputu searchInput
        // akcja kliknięcia na lupkę


        return new SearchResultPage(driver);

    }
}
