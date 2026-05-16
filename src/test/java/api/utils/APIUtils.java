package api.utils;

import io.restassured.response.Response;

public class APIUtils {

    public static int getStatusCode(Response response) {
        return response.getStatusCode();
    }
}