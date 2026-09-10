package junit5;

import lesson_7_junit_5.TriangleArea;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaTest {
    private TriangleArea calculator;

    @BeforeEach
    void setUp() {
        calculator = new TriangleArea();
    }

    @Test
    void testValidTriangle() {
        assertEquals(6.0, calculator.calculate(3, 4, 5), 0.001);
    }

    @Test
    void testInvalidTriangleSides() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculate(1, 2, 10));
    }
}
