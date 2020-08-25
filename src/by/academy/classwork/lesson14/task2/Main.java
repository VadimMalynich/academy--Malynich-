package by.academy.classwork.lesson14.task2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String str=null;
        Predicate predicate = i -> i != null;
        System.out.println(predicate.test("55"));
        System.out.println(predicate.test(str));
        System.out.println(predicate.test("-5"));
    }
}
