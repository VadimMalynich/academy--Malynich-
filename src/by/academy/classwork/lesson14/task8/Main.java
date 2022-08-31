package by.academy.classwork.lesson14.task8;

/*Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
	Используем функциональный интерфейс Supplier.*/

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier supplier = () -> (int) (0 + Math.random() * 11);
        System.out.println(supplier.get());
    }
}