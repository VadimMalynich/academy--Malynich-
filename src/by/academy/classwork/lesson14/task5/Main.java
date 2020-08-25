package by.academy.classwork.lesson14.task5;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String string1 = "Nakwf";
        String string2 = "JdqdA";
        String string3 = "dqwdqA";
        String string4 = "NdqdA";
        String string5 = null;

        Predicate<String> pr = (String str) -> (str != null && str.endsWith("A") && (str.startsWith("J") || str.startsWith("N")));
        System.out.println(pr.test(string1));
        System.out.println(pr.test(string2));
        System.out.println(pr.test(string3));
        System.out.println(pr.test(string4));
        System.out.println(pr.test(string5));
    }
}
