package google.search;

import google.search.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseTest;



public class GoogleSearchTest extends BaseTest {

    //1. open browser
    //2. go to Google main page
    //3. type search query
    //4. submit query
    //5. verify Results Page is opened
    @Test(groups = "brokenTests")
    public void test0001() {
        MainPage mainPage = new MainPage(driver);
        //ResultsPage resultsPage = new ResultPage(driver);

        mainPage.open();
        mainPage.typeSearchQuery("Portnov Computer School");
        mainPage.submitQuery();

        //waitFor(5);
        waitForElement();
        verifyResultsPage();
    }

    private void waitForElement() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));

        //wait.until(webDriver -> webDriver.findElement(By.id("result-stats")).isDisplayed());
    }

    private void verifyResultsPage() {
        WebElement element = driver.findElement(By.id("result-stats"));
        boolean displayed = element.isDisplayed();
        Assert.assertEquals(displayed, true);
    }
}
