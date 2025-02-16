package extended.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebFormPage extends BasePage {
    public WebFormPage(WebDriver driver) {
        super(driver);
    }

    @Step("Fill text input with: {text}")
    public void fillTextInput(String text) {
        driver.findElement(By.id("my-text-id")).sendKeys(text);
    }

    @Step("Submit from")
    public void submitForm() {
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
    }

    @Step("Get title")
    public WebElement getTitle() {
        return driver.findElement(By.className("display-6"));
    }
}