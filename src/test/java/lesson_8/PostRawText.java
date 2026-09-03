package lesson_8;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class PostRawText extends PostmanEchoTest{

    @Test
    void testPostRawRequest() {
        String requestBody = "{\"name\": \"John Smit\", \"age\": 20}";

        given()
                .log().all()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("json.name", equalTo("John Smit"))
                .body("json.age", equalTo(20))
                .body("data.name", equalTo("John Smit"));
    }
}