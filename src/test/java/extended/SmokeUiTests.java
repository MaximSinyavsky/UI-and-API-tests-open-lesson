package extended;


import extended.pages.HomePage;
import extended.pages.WebFormPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@Feature("SmokeUiTests")
@Tag("ui")
@Tag("smoke")
public class SmokeUiTests {
    HomePage homePage;

    @BeforeEach
    void setup() {
        homePage = new HomePage(new ChromeDriver());
    }

    @AfterEach
    void tearDown() {
        homePage.quit();
    }

    @Test
    @DisplayName("Check form submitted and has title")
    void submitWebFormTest() {
        WebFormPage webFormPage = webFormPage = homePage.openWebForm();

        webFormPage.fillTextInput("text");
        webFormPage.submitForm();
        WebElement title = webFormPage.getTitle();

        Assertions.assertEquals("Form submitted", title.getText());
    }
}
