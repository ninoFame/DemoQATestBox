package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage extends BaseTest {
    WebDriver driver;
    WebElement elementsPage;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementsPage() {
        return driver.findElement(By.cssSelector("div[class='category-cards'] div:nth-child(1) div:nth-child(1) div:nth-child(3)"));
    }

    public void clickOnElements () {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getElementsPage());
        getElementsPage().click();
    }
}
