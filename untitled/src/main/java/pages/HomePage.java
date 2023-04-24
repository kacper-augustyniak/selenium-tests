package pages;

import address.PageAddress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.CategorySideBar;

public class HomePage {

    private WebDriver driver;
    private CategorySideBar categorySideBar;
    private PageAddress pageAddress;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage launchPage() {
        driver.get(pageAddress.getHomePageUrl());
        return new HomePage(driver);
    }

    public SubPage chooseManCategory(int type) {
        categorySideBar.getMenButton().click();
        switch(type) {
            case 1: categorySideBar.getMenTshirtsButton().click();
            case 2: categorySideBar.getMenJeansButton().click();

        }
        return new SubPage(driver);
    }

    public SubPage chooseBrand(int )






}
