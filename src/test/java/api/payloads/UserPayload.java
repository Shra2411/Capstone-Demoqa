package api.payloads;

public class UserPayload {

    public static String createUser(String name, String job) {
        return "{ \"name\": \"" + name + "\", \"job\": \"" + job + "\" }";
    }
}