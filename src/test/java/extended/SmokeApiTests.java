package extended;

import extended.controllers.UserController;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static extended.testdata.Constants.DEFAULT_USER;

@Feature("SmokeApiTests")
@Tag("api")
@Tag("smoke")
class SmokeApiTests {
    UserController userController = new UserController();

    @Test
    @DisplayName("Check add user is returns 200 status ok")
    void createUserTest() {
        Response response = userController.createUser(DEFAULT_USER);
        Assertions.assertEquals(200, response.statusCode());
    }
}