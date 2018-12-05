package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

public class AuthorizationPageObject extends MainPageObject {

    private static final String
            LOGIN_BUTTON = "xpath://body/div/a[text()='Log in']",
            LOGIN_INPUT = "css:#wpName1",
            PASSWORD_INPUT = "css:#wpPassword1",
            SUBMIT_BUTTON = "css:#wpLoginAttempt";

    public AuthorizationPageObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void clickAuthButton() {
        waitForElementPresent(LOGIN_BUTTON, "Cannot find login button", 5);
        waitForElementAndClick(LOGIN_BUTTON, "Cannot click login button", 5);
    }

    public void enterLoginData(String username, String password) {
        waitForElementAndSendKeys(LOGIN_INPUT, username,"Cannot find and type into login input", 5);
        waitForElementAndSendKeys(PASSWORD_INPUT, password,"Cannot find and type into password input", 5);
    }

    public void submitForm() {
        waitForElementAndClick(SUBMIT_BUTTON, "Cannot find and click on submit button", 5);
    }

}
