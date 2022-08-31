package by.academy.classwork.lesson14.task6;

import by.academy.classwork.lesson12.task5.HeavyBox;

import java.util.function.Consumer;

/*Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и
	выводит на консоль сообщение “Отгрузили ящик с весом n”. “Отправляем ящик с весом n”
	Используем функциональный интерфейс Consumer и метод по умолчанию andThen.*/
public class Main {
    public static void main(String[] args) {
        HeavyBox hb = new HeavyBox();
        hb.add(50, 20, 2, 5);
        Consumer<HeavyBox> consumer = new Consumer<HeavyBox>() {
            @Override
            public void accept(HeavyBox heavyBox) {
                System.out.println("Отгрузили ящик с весом " + heavyBox.getWeight());
                System.out.println("Отправляем ящик с весом " + heavyBox.getWeight());
            }
        };
        consumer.accept(hb);
    }
}
