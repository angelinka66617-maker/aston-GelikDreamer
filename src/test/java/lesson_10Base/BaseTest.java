package lesson_10Base;


import lesson_10Maine.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

/**
 * Общая подготовка для всех тестов:
 * перед каждым тестом — открыть браузер и страницу, после — закрыть браузер.
 */
public abstract class BaseTest {
    protected WebDriver driver;
    protected MainPage mainPage;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.open();
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}