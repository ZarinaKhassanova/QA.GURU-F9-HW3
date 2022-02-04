package guru.qa;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;

/**
 * Проверка на наличие кода для JUnit5 на странице SoftAssertions
 * в разделе Wiki проекта Selenide в Github
 */
public class TestWikiSoftAssertions {

    @BeforeAll
    static void settings() {
        System.setProperty("webdriver.chrome.driver","src/tools/chromedriver.exe");
        Configuration.browserSize = "1440x900";
    }

    @BeforeEach
    void openURL() {
        // Открываем страницу Selenide в Github
        open("https://github.com/selenide/selenide");
    }

    @AfterEach
    void closesWebDriver(){
        //После каждого теста закрываем веб-дайвер
        closeWebDriver();
    }

    @Test
    void checkWikiSoftAssertions(){

        //region
        //endregion
    }
}
