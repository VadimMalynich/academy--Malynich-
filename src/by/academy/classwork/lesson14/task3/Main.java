package by.academy.classwork.lesson14.task3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String string1 = "dwdwfe";
        String string2 = "null";
        String string3 = null;

        Predicate<String> predicate = str -> str != null;
        System.out.println(predicate.test(string1));
        System.out.println(predicate.test(string2));
        System.out.println(predicate.test(string3));
    }
}
