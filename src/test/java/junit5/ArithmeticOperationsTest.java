package junit5;

import lesson_7_junit_5.ArithmeticOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArithmeticOperationsTest {
    private ArithmeticOperations operations;

    @BeforeEach
    void setUp() {
        operations = new ArithmeticOperations();
    }

    @Test
    void testAddition() {
        assertEquals(5, operations.add(2, 3));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> operations.divide(10, 0));
    }
}