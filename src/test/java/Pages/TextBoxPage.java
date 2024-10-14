package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends BaseTest {
    WebDriver driver;
    WebElement fullName;
    WebElement eMail;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement geteMail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public void clickOnSubmit(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSubmitButton());
        getSubmitButton().click();
    }

    public WebElement resultBox () {
        return driver.findElement(By.id("output"));
    }
}
