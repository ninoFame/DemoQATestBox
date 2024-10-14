package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage extends BaseTest {
    WebDriver driver;
    WebElement TextBox;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTextBox() {
        return driver.findElement(By.className("text"));
    }

    public void clickOnTextBox () {
        if (getTextBox().getText().equalsIgnoreCase("Text Box")) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getTextBox());
        getTextBox().click();}
    }
}
