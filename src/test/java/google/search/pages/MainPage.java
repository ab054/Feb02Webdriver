package google.search.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private static final String GOOGLE_MAIN_PAGE_URL = "https://www.google.com/";
    By searchInputElement = By.name("q");


    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(GOOGLE_MAIN_PAGE_URL);
    }

    public void typeSearchQuery(String query) {
        WebElement element = driver.findElement(searchInputElement);
        element.sendKeys(query);
    }

    public void submitQuery() {
        driver.findElement(searchInputElement).submit();
    }
}
