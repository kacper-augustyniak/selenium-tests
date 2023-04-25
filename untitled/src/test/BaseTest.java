package testBase;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

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
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }
}