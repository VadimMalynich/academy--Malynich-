package by.academy.classwork.Lesson2;


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Test {


    static {
        System.out.println("2");
    }

    {
        System.out.println("1");
    }

    public static void main(String[] args) {
        Collection c = new HashSet();
        print(c);
        Counter.invokeCounter();
        Counter.invokeCounter();
        Counter.invokeCounter();
    }

    public static void print(Collection c) {
        System.out.println("Collection");
    }

    public static void print(Set s) {
        System.out.println("Set");
    }

    public static void print(HashSet hs) {
        System.out.println("HashSet");
    }
}