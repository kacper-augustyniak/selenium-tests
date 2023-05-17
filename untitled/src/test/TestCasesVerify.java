import address.PageAddress;
import org.testng.annotations.Test;
import pageobject.TestCasesObjects;
import pages.HomePage;
import pages.TestCasesPage;
import static org.testng.AssertJUnit.*;

public class TestCasesVerify extends BaseTest {

    private PageAddress pageAddress;
    private TestCasesObjects testCasesObjects;

    private String testCasesHeader = "Below is the list of test Cases for you to practice the Automation.";

    // functional
    @Test
    public void testCasesVerification() {
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilHomePageVisible();
        TestCasesPage testCasesPage = homePage.openTestCases();
        testCasesPage.waitForTestCasesHeader();
        assertTrue(testCasesPage.collectQuantityOfTestCases()); // 26 test cases to automate at this page
    }


}
