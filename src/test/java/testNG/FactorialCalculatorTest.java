package testNG;

import lesson_7.FactorialCalculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {
    private FactorialCalculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new FactorialCalculator();
    }

    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(calculator.calculate(0), 1L);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegativeThrowsException() {
        calculator.calculate(-1);
    }
}