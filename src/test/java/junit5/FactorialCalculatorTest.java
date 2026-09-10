package junit5;

import lesson_7_junit_5.FactorialCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {
    private FactorialCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new FactorialCalculator(); // Создаем объект
    }

    @Test
    void testFactorialOfZero() {
        assertEquals(1, calculator.calculate(0));
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, calculator.calculate(5));
    }

    @Test
    void testFactorialNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculate(-1));
    }
}