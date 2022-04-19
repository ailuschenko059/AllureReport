import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

@DisplayName("Тест чистый Selenide")
public class TestGhAllureSelenide {

    @Test
    @Owner("ailuschenko059")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Задачи в репозитории")
    @Story("Просмотр созданных задач в репозитории")
    @Link(value="GitHub",url = "https://github.com")
    @DisplayName("Тест чистый Selenide")
    public void testGHIssue() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");
        $(".header-search-input").click();
        $(".header-search-input").setValue("ailuschenko059/AllureReport");
        $(".header-search-input").submit();
        $(linkText("ailuschenko059/AllureReport")).click();
        $(partialLinkText("Issues")).click();
        $(withText("#1")).should(Condition.visible);
    }
}
