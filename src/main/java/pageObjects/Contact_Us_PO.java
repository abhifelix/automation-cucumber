package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.Global_Variables;

public class Contact_Us_PO extends Base_PO {

    @FindBy(how = How.NAME, using = "first_name")
    private WebElement firstname_Text;

    @FindBy(how = How.NAME, using = "last_name")
    private WebElement lastname_Text;

    @FindBy(how = How.NAME, using = "email")
    private WebElement emailAddress_Text;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='Comments']")
    private WebElement comment_TextField;

    @FindBy(how = How.XPATH, using = "//input[@value='SUBMIT']")
    private WebElement submit;

    @FindBy(how = How.XPATH, using = "//input[@value='RESET']")
    private WebElement reset;

    @FindBy(how = How.XPATH, using = "//div[@id='contact_reply']/h1")
    private WebElement successful_ContactUs_Submission ;

    public Contact_Us_PO() {
        super();
    }
    public void navigateTo_WebDriverUniversity_Contact_Us_Page()
    {
        navigateTo_URL(Global_Variables.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Contact-Us/contactus.html");
    }
    public void setUnique_Firstname()
    {
        sendKeys(firstname_Text, "Abhi" + GenerateRandomNumber(5));
    }

    public void setUnique_Lastname()
    {
        sendKeys(lastname_Text, "shetty" + GenerateRandomNumber(5));
    }

    public void setUnique_EmailAddress()
    {
        sendKeys(emailAddress_Text, "abhijeeth.kadamba" + GenerateRandomNumber(5) + "@gmail.com");
    }
    public void setUnique_Comment()
    {
        sendKeys(comment_TextField, "Hello world!" + GenerateRandomAlphabet(5));
    }
    public void clickOnSubmit()
    {
        waitForWebElementAndClick(submit);
    }
    public void clickOnReset()
    {
        waitForWebElementAndClick(reset);
    }
    public void setSpecific_Firstname(String firstname)
    {
        sendKeys(firstname_Text, firstname);
    }
    public void setSpecific_Lastname(String lastname)
    {
        sendKeys(lastname_Text, lastname);
    }
    public void setSpecific_EmailAddress(String email)
    {
        sendKeys(emailAddress_Text, email);
    }
    public void setSpecific_Comment(String comment)
    {
        sendKeys(comment_TextField, comment);
    }
    public void validate_Successful_Submission_TextMessage()
    {
        waitForTextVisible(successful_ContactUs_Submission, "Thank You for your Message!");
    }
    public void validateAllTextFieldsCleared() {
        try {
            Assert.assertTrue(firstname_Text.getAttribute("value").isEmpty(), "First name field is not empty.");
            Assert.assertTrue(lastname_Text.getAttribute("value").isEmpty(), "Last name field is not empty.");
            Assert.assertTrue(emailAddress_Text.getAttribute("value").isEmpty(), "Email field is not empty.");
            Assert.assertTrue(comment_TextField.getAttribute("value").isEmpty(), "Comments field is not empty.");
        } catch (Exception e) {
            throw e;
        }
    }
}
