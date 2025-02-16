package extended;


import extended.pages.HomePage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;

@Feature("SmokeUiTests")
@Tag("ui")
@Tag("smoke")
public class SmokeUiTests {
    HomePage homePage;

    @BeforeEach
    void setUp(){
        homePage = new HomePage(new ChromeDriver());
    }

    @AfterEach
    void tearDown(){
        homePage.quit();
    }

    @Test
    @DisplayName("Check form submitted and has title")
    void submitWebFormTest(){
        webFormPage = webFormPage = homePage.openWebForm();

        webFormPage.fillTextInpute("text");
        webFormPage.submitForm();
        webelement title = webFormePage.getTitle();

        Assertions.assertEquals("Form submitted", tittle.getText());
    }
}
