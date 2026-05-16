package api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class UserAPITest {

    @Test
    public void getBooksTest() {

        Response response =

                given()

                .when()

                .get(
                  "https://demoqa.com/BookStore/v1/Books"
                );

        System.out.println(
                response.asPrettyString()
        );

        Assert.assertEquals(
                response.getStatusCode(),
                200
        );
    }
}