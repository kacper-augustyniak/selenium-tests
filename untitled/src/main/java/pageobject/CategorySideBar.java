package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategorySideBar {

    @FindBy(xpath = "//*[@id=\"Women\"]")
    private WebElement womenButton;

    @FindBy(xpath = "//*[@id=\"Men\"]")
    private WebElement menButton;

    @FindBy(xpath = "//*[@id=\"Kids\"]")
    private WebElement kidsButton;
    @FindBy(xpath = "//*[@id=\"Kids\"]//ul/li[1]")
    private WebElement womenDressButton;

    @FindBy(xpath = "//*[@id=\"Women\"]//ul/li[2]")
    private WebElement womenTopsButton;

    @FindBy(xpath = "//*[@id=\"Women\"]//ul/li[3]")
    private WebElement womenSareeButton;

    @FindBy(xpath = "//*[@id=\"Women\"]//ul/li[1]")
    private WebElement menTshirtsButton;

    @FindBy(xpath = "//*[@id=\"Women\"]//ul/li[2]")
    private WebElement menJeansButton;

    @FindBy(xpath = "//*[@id=\"Kids\"]//ul/li[1]")
    private WebElement kidsDressButton;

    @FindBy(xpath = "//*[@id=\"Kids\"]//ul/li[2]")
    private WebElement kidsTopsAndShirtsButton;

    @FindBy(xpath = "//*[@class='nav nav-pills nav-stacked']//li[1]")
    private WebElement brandsPoloButton;

    @FindBy(xpath = "//*[@class='nav nav-pills nav-stacked']//li[2]")
    private WebElement brandsHAndMButton;

    @FindBy(xpath = "//*[@class='nav nav-pills nav-stacked']//li[3]")
    private WebElement brandsMadameButton;

    @FindBy(xpath = "//*[@class='nav nav-pills nav-stacked']//li[4]")
    private WebElement brandsMastAndHarbourButton;

    @FindBy(xpath = "//*[@class='nav nav-pills nav-stacked']//li[5]")
    private WebElement brandsBabyhugButton;

    @FindBy(xpath = "//*[@class='nav nav-pills nav-stacked']//li[6]")
    private WebElement brandsAllenSollyJuniorButton;

    @FindBy(xpath = "//*[@class='nav nav-pills nav-stacked']//li[7]")
    private WebElement brandsKookieKidsButton;

    @FindBy(xpath = "//*[@class='nav nav-pills nav-stacked']//li[8]")
    private WebElement brandsBibaButton;

    public WebElement getWomenButton() {
        return womenButton;
    }

    public WebElement getMenButton() {
        return menButton;
    }

    public WebElement getKidsButton() {
        return kidsButton;
    }

    public WebElement getWomenDressButton() {
        return womenDressButton;
    }

    public WebElement getWomenTopsButton() {
        return womenTopsButton;
    }

    public WebElement getWomenSareeButton() {
        return womenSareeButton;
    }

    public WebElement getMenTshirtsButton() {
        return menTshirtsButton;
    }

    public WebElement getMenJeansButton() {
        return menJeansButton;
    }

    public WebElement getKidsDressButton() {
        return kidsDressButton;
    }

    public WebElement getKidsTopsAndShirtsButton() {
        return kidsTopsAndShirtsButton;
    }

    public WebElement getBrandsPoloButton() {
        return brandsPoloButton;
    }

    public WebElement getBrandsHAndMButton() {
        return brandsHAndMButton;
    }

    public WebElement getBrandsMadameButton() {
        return brandsMadameButton;
    }

    public WebElement getBrandsMastAndHarbourButton() {
        return brandsMastAndHarbourButton;
    }

    public WebElement getBrandsBabyhugButton() {
        return brandsBabyhugButton;
    }

    public WebElement getBrandsAllenSollyJuniorButton() {
        return brandsAllenSollyJuniorButton;
    }

    public WebElement getBrandsKookieKidsButton() {
        return brandsKookieKidsButton;
    }

    public WebElement getBrandsBibaButton() {
        return brandsBibaButton;
    }
}
