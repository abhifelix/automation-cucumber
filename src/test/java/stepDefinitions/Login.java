package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

public class Login extends Base_PO {
    private Login_PO login_po;
    public Login(Login_PO login_po) {
        this.login_po = login_po;
    }

    @Given("I access the WebDriver university Login page")
    public void i_access_the_web_driver_university_login_page() {
        login_po.navigateTo_WebDriverUniversity_Login_Page();
    }
    @When("I enter the valid username {word}")
    public void i_enter_the_valid_username(String username) {
        login_po.setUsername(username);
    }
    @And("I enter valid password {word}")
    public void i_enter_valid_password(String password) {
        login_po.setPassword(password);
    }
    @And("I click on login button")
    public void i_click_on_login_button() {
        login_po.clickOn_Login();
    }
    @Then("I should be presented with a successful login message")
    public void i_should_be_presented_with_a_successful_login_message() {
        login_po.validate_SuccessfulLogin_Message();
    }
    @When("I enter invalid password {word}")
    public void i_enter_invalid_password(String password) {
        login_po.setPassword(password);
    }
    @Then("I should be presented with a validation failed message")
    public void i_should_be_presented_with_a_validation_failed_message() {
        login_po.validate_UnSuccessfulLogin_Message();
    }
    @When("I enter the username {word}")
    public void i_enter_the_username(String username) {
        login_po.setUsername(username);
    }
    @When("I enter the password {word}")
    public void i_enter_the_password(String password) {
        login_po.setPassword(password);
    }
    @Then("I should be presented with a validationMessaage {}")
    public void i_should_be_presented_with_a_validationMessaage(String validationMessaage) {
        waitForAlertAnd_ValidateText(validationMessaage);
    }
}
