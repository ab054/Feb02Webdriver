import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class RestTests {

    @Test
    public void testName() {
        when().
                get("https://petstore.swagger.io/v2/pet/9222968140497182485").
                then().
                statusCode(200).
                body("name", equalTo("DOG NAME FROM ENVIROMENT"));
    }
}