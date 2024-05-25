package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.Global_Variables;

public class Login_PO extends Base_PO {

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
    private WebElement username_TextField;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
    private WebElement password_TextField;

    @FindBy(how = How.ID, using = "login-button")
    private WebElement login_Button;
    public Login_PO() {
        super();
    }
    public void navigateTo_WebDriverUniversity_Login_Page()
    {
        navigateTo_URL(Global_Variables.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Login-Portal/index.html");
    }
    public void setUsername(String username)
    {
        sendKeys(username_TextField, username);
    }
    public void setPassword(String password)
    {
        sendKeys(password_TextField, password);
    }
    public void clickOn_Login()
    {
       waitForWebElementAndClick(login_Button);
    }
    public void validate_SuccessfulLogin_Message()
    {
        waitForAlertAnd_ValidateText("validation succeeded");
    }
    public void validate_UnSuccessfulLogin_Message()
    {
        waitForAlertAnd_ValidateText("validation failed");
    }

}
