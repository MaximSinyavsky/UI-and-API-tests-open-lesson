package extended.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(BASE_URL);
    }

    @Step("Open web form page")
    public WebFormPage openWebForm() {
        driver.findElement(By.linkText("Web form")).click();
        return new WebFormPage(driver);
    }
}