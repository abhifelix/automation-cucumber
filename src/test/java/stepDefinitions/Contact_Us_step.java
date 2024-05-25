package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.Base_PO;
import pageObjects.Contact_Us_PO;

public class Contact_Us_step extends Base_PO {
    private WebDriver driver = getDriver();
    private Contact_Us_PO contact_us_po;
    public Contact_Us_step(Contact_Us_PO contact_us_po) {
        this.contact_us_po = contact_us_po;
    }

    @Given("I access the WebDriver university Contact Us page")
    public void i_access_the_web_driver_university_contact_us_page () {
        contact_us_po.navigateTo_WebDriverUniversity_Contact_Us_Page();
    }
    @When("I enter the first name")
    public void i_enter_the_first_name () {
        contact_us_po.setUnique_Firstname();
    }
    @And("I enter the last name")
    public void i_enter_the_last_name () {
        contact_us_po.setUnique_Lastname();
    }
    @And("I enter the email address")
    public void i_enter_the_email_address () {
        contact_us_po.setUnique_EmailAddress();
    }
    @And("I enter the comment")
    public void i_enter_the_comment () {
        contact_us_po.setUnique_Comment();
    }
    @And("I click on submit button")
    public void i_click_on_submit_button () {
        contact_us_po.clickOnSubmit();
    }
    @Then("I should be presented with a successful Contact Us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message () {
        contact_us_po.validate_Successful_Submission_TextMessage();
    }

    @When("I click on reset button")
    public void i_click_on_reset_button() {
        contact_us_po.clickOnReset();
    }
    @Then("All the text fields should get cleared")
    public void all_the_text_fields_should_get_cleared() {
        contact_us_po.validateAllTextFieldsCleared();
    }
    @When("I enter the specific first name {word}")
    public void i_enter_the_specific_first_name(String firstName) {
        contact_us_po.setSpecific_Firstname(firstName);
    }
    @And("I enter the specific last name {word}")
    public void i_enter_the_specific_last_name(String lastName) {
        contact_us_po.setSpecific_Lastname(lastName);
    }
    @And("I enter the specific email address {word}")
    public void i_enter_the_specific_email_address(String email) {
        contact_us_po.setSpecific_EmailAddress(email);
    }
    @And("I enter the specific comment {string}")
    public void i_enter_the_specific_comment(String comment) {
        contact_us_po.setSpecific_Comment(comment);
    }
}

