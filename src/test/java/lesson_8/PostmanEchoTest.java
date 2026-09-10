package lesson_8;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class PostmanEchoTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }
}