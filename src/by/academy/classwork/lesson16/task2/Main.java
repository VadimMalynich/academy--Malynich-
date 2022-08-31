package by.academy.classwork.lesson16.task2;

import org.junit.experimental.theories.Theories;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread run1 = new Thread(new Running());
        Thread run2 = new Thread(new Running());
        Thread run3 = new Thread(new Running());
        run1.run();
        run2.run();
        run3.run();
    }
}