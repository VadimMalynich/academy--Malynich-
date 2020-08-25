package by.academy.classwork.lesson14.task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int array[] = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = (int) (-1000000000 + Math.random() * 2000000000);
        }
        Printable pr = () -> System.out.println(Arrays.toString(array));
        pr.print();
    }
}
