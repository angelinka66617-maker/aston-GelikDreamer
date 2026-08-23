package junit5;

import lesson_7_junit_5.NumberComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberComparatotTest {
    private NumberComparator comparator;

    @BeforeEach
    void setUp() {
        comparator = new NumberComparator();
    }

    @Test
    void testFirstLessThanSecond() {
        assertEquals(-1, comparator.compare(2, 5));
    }

    @Test
    void testNumbersAreEqual() {
        assertEquals(0, comparator.compare(7, 7));
    }
}