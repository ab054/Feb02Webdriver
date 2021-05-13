package uiTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

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
}
