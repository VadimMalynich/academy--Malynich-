package by.academy.classwork.lesson14.task4;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String string1 = null;
        String string2 = "";
        String string3 = " dwqd dw";
        Predicate<String> notNull = t->t!=null;
        Predicate<String> notEmpty = t->!t.isEmpty();
        System.out.println(notNull.and(notEmpty).test(string1));
        System.out.println(notNull.and(notEmpty).test(string2));
        System.out.println(notNull.and(notEmpty).test(string3));
    }


}
