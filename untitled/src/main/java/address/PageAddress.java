package address;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class PageAddress extends BasePage {
    private String env;

    public PageAddress(String env, WebDriver driver) {
        super(driver);
        this.env = env;
    }

    protected String homePageUrl = "https://automationexercise.com/";
    protected String productsPageUrl = "https://automationexercise.com/products";
    protected String cartPageUrl = "https://automationexercise.com/view_cart";
    protected String signupLoginPageUrl = "https://automationexercise.com/login";
    protected String testCasesPageUrl = "https://automationexercise.com/test_cases";
    protected String apiTestingPageUrl = "https://automationexercise.com/api_list";
    protected String videoTutorialsPageUrl = "https://www.youtube.com/c/AutomationExercise";
    protected String contactUsPageUrl = "https://automationexercise.com/contact_us";

    protected String signupPageUrl = "https://automationexercise.com/signup";

    protected String accountCreatedPageUrl = "https://automationexercise.com/account_created";

    protected String accountDeletedPageUrl = "https://automationexercise.com/delete_account";
    protected String advertisementPageUrl = "https://automationexercise.com/#google_vignette";

    public String getHomePageUrl() {
        return homePageUrl;
    }

    public String getProductsPageUrl() {
        return productsPageUrl;
    }

    public String getCartPageUrl() {
        return cartPageUrl;
    }

    public String getSignupLoginPageUrl() {
        return signupLoginPageUrl;
    }

    public String getTestCasesPageUrl() {
        return testCasesPageUrl;
    }

    public String getApiTestingPageUrl() {
        return apiTestingPageUrl;
    }

    public String getVideoTutorialsPageUrl() {
        return videoTutorialsPageUrl;
    }

    public String getContactUsPageUrl() {
        return contactUsPageUrl;
    }

    public String getSignupPageUrl() {
        return signupPageUrl;
    }

    public String getAccountCreatedPageUrl() {
        return accountCreatedPageUrl;
    }

    public String getAccountDeletedPageUrl() {
        return accountDeletedPageUrl;
    }

    public String getAdvertisementPageUrl() {
        return advertisementPageUrl;
    }
}
