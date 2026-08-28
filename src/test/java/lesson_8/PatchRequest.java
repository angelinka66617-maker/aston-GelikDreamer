package lesson_8;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PatchRequest extends PostmanEchoTest{

    @Test
    void testPatchRequest() {
        String jsonPayload = "Patch";

        given()
                .log().all()
                .contentType("application/json")
                .body(jsonPayload)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo(jsonPayload));
    }
}