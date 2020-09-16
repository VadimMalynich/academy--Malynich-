package by.academy.homework.homework6.task3;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

public class TestTwo {
    private int x;
    private int y;
    private int result;

    public TestTwo(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{0} - {1}={2}")
    public static Iterable<Object[]> testCalc() {
        return Arrays.asList(new Object[][]{{5, 3, 2}, {-5, 3, -8}, {-10, -16, 6}});
    }

    @Test
    public void testCalc2() throws Exception {
        Assert.assertEquals(result, Calculator.difference(x, y));
    }
}
