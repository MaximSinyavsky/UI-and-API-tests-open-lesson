import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class SmokeApiTest {
    private static final String BASE_URL = "https://petstore.swagger.io/v2/";
    void createUserTest(){
        //given - config
        //when - http
        //then - assert
        String bodyJson = """
                {
                "id": 0,
                  "username": "string",
                  "firstName": "string",
                  "lastName": "string",
                  "email": "string",
                  "password": "string",
                  "phone": "string",
                  "userStatus": 0
                  }""";
        ValidatableResponse response = given()
                .header("accept", "application/json")
                .header("content-type", "application/json")
                .body(bodyJson)
                .when().post(BASE_URL + "user")
                .then();
        response.statusCode(200);
        response.extract().response().prettyPrint();
    }
}
