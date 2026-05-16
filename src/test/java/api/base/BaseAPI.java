package api.base;

import io.restassured.RestAssured;

public class BaseAPI {

    public static void setup() {

        RestAssured.baseURI =
                "https://demoqa.com";
    }
}