package testNG;

import lesson_7.TriangleArea;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriangleAreaTest {
    private TriangleArea calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new TriangleArea();
    }

    @Test
    public void testValidTriangle() {
        double result = calculator.calculate(3, 4, 5);
        Assert.assertEquals(result, 6.0, 0.001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidTriangleSides() {
        calculator.calculate(1, 2, 10);
    }
}
