package pageObject;

import io.qameta.allure.Step;
import testBase.TestBase;

import static com.codeborne.selenide.Selenide.$;

public class AllureGhObject extends TestBase {



    public static void searchForRepository(String repo) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repo);
        $(".header-search-input").submit();
    }
}
