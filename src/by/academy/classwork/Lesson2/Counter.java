package by.academy.classwork.Lesson2;

public class Counter {
    static int count;

    public static void invokeCounter() {
        count++;
        System.out.println("Текущее значение счётчика -" + count);
    }
}
