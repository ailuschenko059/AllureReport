package testBase;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    @Step("Открываем главную страницу")
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
    }
}
