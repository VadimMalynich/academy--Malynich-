package by.academy.classwork.lesson10.task10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BoxDemo<Integer> integer1 = new BoxDemo<>(10);
        integer1.add(111);
        integer1.addToEnd(666);
        System.out.println(integer1.getItem(-5));
        integer1.print();
        integer1.addToIndex(555,15);
        integer1.add(111);
        integer1.addToIndex(444,15);
        integer1.print();
        System.out.println(Arrays.toString(integer1.getArray()));
    }
}
