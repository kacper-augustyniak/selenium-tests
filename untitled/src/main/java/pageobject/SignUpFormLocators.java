package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpFormLocators {

    @FindBy (xpath = "//h2//*[contains(text(), 'Enter Account Information')]")
    private WebElement signUpFormHeader;

    @FindBy (id = "id_gender1")
    private WebElement mrButton;

    @FindBy (id = "id_gender2")
    private WebElement msButton;

    @FindBy (id = "password")
    private WebElement password;

    @FindBy (id)


}
