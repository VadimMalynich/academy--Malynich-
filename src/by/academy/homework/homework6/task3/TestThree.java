package by.academy.homework.homework6.task3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestThree {
    private int x;
    private int y;
    private int result;

    public TestThree(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    @Test
    public void testCalc3() throws Exception {
        assertEquals(result, Calculator.multiplication(x, y));
    }

    @Parameterized.Parameters(name = "{0} * {1} = {2}")
    public static Iterable<Object[]> testCalc() {
        return Arrays.asList(new Object[][]{{4, 2, 8}, {0, 15, 0}, {11, 8, 88}});
    }
}
