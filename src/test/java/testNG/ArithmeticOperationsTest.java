package testNG;

import lesson_7.ArithmeticOperations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArithmeticOperationsTest {
    private ArithmeticOperations operations;

    @BeforeMethod
    public void setUp() {
        operations = new ArithmeticOperations();
    }

    @Test
    public void testAddition() {
        Assert.assertEquals(operations.add(2, 3), 5);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        operations.divide(10, 0);
    }
}
