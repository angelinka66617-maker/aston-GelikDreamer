package lesson_8;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DeleteRequest extends PostmanEchoTest {

    @Test
    void deleteRequest() {
        given()
                .log().all()
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("url", containsString("/delete"))
                .body("headers", notNullValue());
    }
}