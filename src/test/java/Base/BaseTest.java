package Base;
/*Otici na https://demoqa.com/ sajt, zatim na elements->text box i testirati popunjavanje forme sa validnim, nevalidnim mail-om i proveriti da li je output ispravan za svako polje*/

import Pages.ElementsPage;
import Pages.Homepage;
import Pages.TextBoxPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public Homepage homepage;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;

    @BeforeClass
    public void setUp () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        homepage = new Homepage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
    }

}
