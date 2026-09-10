package lesson_9Test;

import lesson_9.MtsRechargePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class lesson_9Test extends MtsRechargePage {

    @Test
    void TitleBlockTest() {
        WebElement titleBlock = wait.until(ExpectedConditions.visibilityOfElementLocated(blockTitle));
        assertTrue(titleBlock.isDisplayed(), "Название блока не отображается");
        assertEquals("ОНЛАЙН ПОПОЛНЕНИЕ\nБЕЗ КОМИССИИ", titleBlock.getText().trim(), "Неверный заголовок блока");
    }

    @Test
    public void testRegistrationInput() {
        WebElement phoneField = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneInput));
        phoneField.clear();
        phoneField.sendKeys("297777777");

        WebElement sumField = driver.findElement(sumInput);
        sumField.clear();
        sumField.sendKeys("30");

        WebElement submitButtonElement = wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        assertTrue(submitButtonElement.isEnabled(), "Кнопка 'Продолжить' не активна");
        submitButtonElement.click();

        WebElement appPaymentContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='payment-widget-iframe']")));
        assertTrue(appPaymentContainer.isDisplayed(), "Форма оплаты не появиляется после нажатия кнопки 'Продолжить'");
    }

    @Test
    void testPaymentLogo() {
        List<WebElement> logos = driver.findElements(allLogos);
        assertFalse(logos.isEmpty(), "Логотипы платежных систем не найдены");
        for (WebElement logo : logos) {
            assertTrue(logo.isDisplayed(), "Один из логотипов платежных систем не отображается");
            assertFalse(logo.getAttribute("src").isEmpty(), "У логотипа отсутствует источник изображения (src)");
        }
    }

    @Test
    void testMoreInfoLink() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(moreInfoLink));
        assertTrue(link.isDisplayed(), "Переход по ссылке 'Подробнее о сервисе' не произошел");
        link.click();
        WebElement moreInfoTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(moreInfoText));
        assertTrue(moreInfoTextElement.isDisplayed(), "Нет такого текста");
        assertEquals("Информация о безопасности Интернет-платежей", moreInfoTextElement.getText().trim(), "Неверный заголовок блока");
    }
}
