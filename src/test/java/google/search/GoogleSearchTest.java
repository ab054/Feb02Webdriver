package google.search;

import google.search.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
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

    public void waitForElement(By element){

    }

    //1. open browser
    //2. go to Google main page
    //3. type search query
    //4. submit query
    //5. verify Results Page is opened
    @Parameters({ "queryValue" })
    @Test(groups = "brokenTests")
    public void test0002(String testData1) {
        MainPage mainPage = new MainPage(driver);
        //ResultsPage resultsPage = new ResultPage(driver);

        mainPage.open();
        mainPage.typeSearchQuery(testData1);
        mainPage.submitQuery();

        //waitFor(5);
        waitForElement();
        verifyResultsPage();
    }


    @Test(dataProvider = "dataProvider001")
    public void test0003(String testData1) {
        MainPage mainPage = new MainPage(driver);
        //ResultsPage resultsPage = new ResultPage(driver);

        mainPage.open();
        mainPage.typeSearchQuery(testData1);
        mainPage.submitQuery();

        //waitFor(5);
        waitForElement();
        verifyResultsPage();
    }




    private void verifyResultsPage() {
        WebElement element = driver.findElement(By.id("result-stats"));
        boolean displayed = element.isDisplayed();
        Assert.assertEquals(displayed, true);
    }
}
