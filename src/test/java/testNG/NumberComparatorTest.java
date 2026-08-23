package testNG;

import lesson_7.NumberComparator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NumberComparatorTest {
    private NumberComparator comparator;

    @BeforeMethod
    public void setUp() {
        comparator = new NumberComparator();
    }

    @Test
    public void testFirstLessThanSecond() {
        Assert.assertEquals(comparator.compare(2, 5), -1);
    }

    @Test
    public void testNumbersAreEqual() {
        Assert.assertEquals(comparator.compare(7, 7), 0);
    }
}