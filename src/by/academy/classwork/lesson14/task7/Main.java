package by.academy.classwork.lesson14.task7;

/*Написать лямбда выражение, которое принимает на вход число и возвращает значение
	“Положительное число”, “Отрицательное число” или  “Ноль”.
	Используем функциональный интерфейс Function.*/

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> f = integer -> integer > 0 ? "Положительное число" : integer ==0 ? "Ноль": "Отрицательное число";
        System.out.println(f.apply(6));
    }
}