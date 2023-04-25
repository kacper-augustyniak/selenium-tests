import address.PageAddress;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    PageAddress pageAddress;
    WebDriver driver;
    String driverPath = "C:\\_dane\\_projekty\\chromedriver112.exe";

    @BeforeTest
    public void before() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeOptions options = new ChromeOptions();
        options.setImplicitWaitTimeout(Duration.ofSeconds(20));
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.setBrowserVersion("112");
        options.addArguments();
        driver = new ChromeDriver(options);
        // uzycie WebDriverManagera
        driver.get(pageAddress.getHomePageUrl());

    }

    @AfterTest
    public void quit() {
        driver.close();
        driver.quit();
    }
}