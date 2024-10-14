package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test (priority = 1)
    public void validUserEmail () throws InterruptedException {
        homepage.clickOnElements();
        elementsPage.clickOnTextBox();
        textBoxPage.getFullName().sendKeys("User");
        textBoxPage.geteMail().sendKeys("user@email.com");
        textBoxPage.clickOnSubmit();
        Thread.sleep(2000);
        Assert.assertTrue(!textBoxPage.resultBox().getText().isBlank());
    }

    @Test (priority = 2)
    public void invalidUserEmail () throws InterruptedException {
        homepage.clickOnElements();
        elementsPage.clickOnTextBox();
        textBoxPage.getFullName().sendKeys("User");
        textBoxPage.geteMail().sendKeys("user@email");
        textBoxPage.clickOnSubmit();
        Thread.sleep(2000);
        Assert.assertTrue(textBoxPage.resultBox().getText().isBlank());
    }

}
