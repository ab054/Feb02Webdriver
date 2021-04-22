import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandles extends BaseTest {
    private static final String WINDOWS_URL = "https://the-internet.herokuapp.com/windows";
    private static final String MAIN_PAGE_LINK_TEXT = "Click Here";

    //1. Open the window's page
    //2. Click on link
    //3. Verify the amount windows/tabs
    //4. Switch to new window
    //5. Verify window title
    //6. Verify text on the page
    @Test
    public void test0001() {
        openWindowsPage();
        clickOnLink();
        verifyAmountWindows();
        switchToNewWindow();
        verifyWindowTitle();
        verifyTextOnPage(); //TODO: ACTUALLY verify text on the page
    }

    //TODO: automate a different scenario with multiple windows
    @Test
    public void test0002() {
    }

    private void verifyTextOnPage() {
        String pageSource = driver.getPageSource();
        boolean textIsThere = pageSource.contains("New Window");
        Assert.assertTrue(textIsThere);
    }

    private void verifyWindowTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "New Window");
    }

    private void switchToNewWindow() {
        Set<String> setOfHandles = driver.getWindowHandles();
        String[] arrayOfStrings = setOfHandles.toArray(new String[]{});
        String secondWindowHandle = arrayOfStrings[1];
        driver.switchTo().window(secondWindowHandle);
    }

    private void verifyAmountWindows() {
        Set<String> windowHandles = driver.getWindowHandles();
        int actual = windowHandles.size();
        int expectedNumber = 2;
        Assert.assertEquals(actual, expectedNumber);
    }

    private void clickOnLink() {
        WebElement element = driver.findElement(By.linkText(MAIN_PAGE_LINK_TEXT));
        element.click();
    }

    private void openWindowsPage() {
        driver.get(WINDOWS_URL);
    }
}
