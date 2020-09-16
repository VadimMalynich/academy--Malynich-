package by.academy.homework.homework6.task3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TestOne {

    private int x;
    private int y;
    private int result;

    public TestOne(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{0} + {1} = {2}")
    public static Iterable<Object[]> testCalc() {
        return Arrays.asList(new Object[][]{{-5, 3, -2}, {0, 15, 15}, {11, 8, 19}});
    }

    @Test
    public void testCalc1() throws Exception {
        Assert.assertEquals(result, Calculator.sum(x, y));
    }
}
