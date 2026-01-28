package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {

    @Test
    public void testIssueSearch() {

        open("https://github.com");
        $(".search-input").click();
        $("#query-builder-test").sendKeys("espereverzeva/qa_quru_HW8_39_Allure");
        $("#query-builder-test").submit();
        $(linkText("espereverzeva/qa_quru_HW8_39_Allure")).click();
        $("#issues-tab").click();
        $(withText("#1")).should(Condition.exist);
    }
}
