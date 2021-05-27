package uiTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import static java.lang.Thread.sleep;

public class BaseTest {

    public WebDriver driver;

    @BeforeSuite
    public void suiteSetup(){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/macOS/geckodriver");
        driver = new FirefoxDriver();
    }

    public void waitFor(int numberOfSeconds) {
        try {
            sleep(numberOfSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @DataProvider(name = "dataProvider001")
    public Object[][] createData1() {
        return new Object[][] {
                { "Portnov Computer School" },
                { "Portnov Computer" },
                { "Amazon "},
        };
    }

    public void waitForElement() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
        //wait.until();
    }
}
