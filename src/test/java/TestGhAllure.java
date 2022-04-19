import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import pageObject.AllureGhObject;

public class TestGhAllure {
    private static final String REPOSITORY = "ailuschenko059/AllureReport";
    private static final int ISSUE_NUMBER = 2;

    @Test
    @Step("Ищем репозиторий {repo}")
    void testGitHub(){
        AllureGhObject.searchForRepository(REPOSITORY);
    }
}
