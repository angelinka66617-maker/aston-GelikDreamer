package lesson_8;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostFromData extends PostmanEchoTest{

    @Test
    void testPostFormRequest() {

        given()
                .log().all()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParams("foo1","bar1")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"));
    }
}