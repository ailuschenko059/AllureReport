import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObject.AllureGhObject;



@DisplayName("Тест с аннотацией @Step")
public class TestGhAllureStep {

    private static final String REPOSITORY = "ailuschenko059/AllureReport";
    private static final int ISSUE_NUMBER = 1;
    AllureGhObject  allureGhObject = new AllureGhObject();

    @Test
    @DisplayName("Поиск репозитория")
    void testGitHub(){
        SelenideLogger.addListener("allure1", new AllureSelenide());
        allureGhObject.openMainPage()
                .searchRepo(REPOSITORY)
                .clickRepo(REPOSITORY)
                .clickIssue()
                .shouldIssueNumber(ISSUE_NUMBER);

    }
}
