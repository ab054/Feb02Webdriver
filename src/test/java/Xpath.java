import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Xpath extends BaseTest {

    @Test
    public void testName() {
        String fullXpath = "/html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]";
        String relativePath = "//form/div[1]/div/div[1]/div/div/input[1]";

        String xPath01 = "//*[@class='sfbg']";
        String xPath02 = "//*[@class='tsf'][@action='/search']";

        String xPath03 = "//*[@attribute_name1='attribute_value1' and @attribute_name2='attribute_value2]";
        String xPath04 = "//*[@attribute_name1='attribute_value1' or @attribute_name2='attribute_value2]";

        String xPath05 = "//div[contains(@class,'spch')]";

        String xPath06 = "//div[starts-with(@class,'spch')]";

        String xPath07 = "//*[text()='Log In']";

        String xPath08 = "//*[@class='sfbg'][last()]";
        String xPath09 = "//*[@class='sfbg'][2]";

        String xPath10 = "//*[@id='FirstName']//following::input[@type='text']";
        String xPath11 = "//*[@id='LastName']//preceding::input[@type='text']";


        driver.findElement(By.xpath(fullXpath));




    }
}
