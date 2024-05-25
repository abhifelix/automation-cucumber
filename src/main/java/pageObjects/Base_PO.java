package pageObjects;

import driver.DriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Global_Variables;

import java.time.Duration;
public class Base_PO {
    public Base_PO() {
        PageFactory.initElements(getDriver(), this);
    }
    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }
    public void navigateTo_URL(String url) {
        getDriver().get(url);
    }
    public String GenerateRandomNumber(int length)
    {
        return RandomStringUtils.randomNumeric(length);
    }
    public String GenerateRandomAlphabet(int length)
    {
        return RandomStringUtils.randomAlphabetic(length);
    }
    public void sendKeys(By by, String textToType) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_TIMEOUT_VALUE));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textToType);
    }
    public void sendKeys(WebElement element, String textToType) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_TIMEOUT_VALUE));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);
    }
    public void waitForTextVisible(WebElement element, String expectedText) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_TIMEOUT_VALUE));
        wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
    }

    public void waitForWebElementAndClick(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_TIMEOUT_VALUE));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }
    public void waitForWebElementAndClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_TIMEOUT_VALUE));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void waitForAlertAnd_ValidateText(String text)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_TIMEOUT_VALUE));
        wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(getDriver().switchTo().alert().getText(), text);
    }
    public void waitFor(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.DEFAULT_TIMEOUT_VALUE));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
