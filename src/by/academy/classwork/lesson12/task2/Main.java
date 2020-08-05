/*Можно писать все в main. Не нужно создавать новых классов.
Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
Замерьте время, которое потрачено на это.
Сравните результаты и предположите, почему они именно такие.*/
package by.academy.classwork.lesson12.task2;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Add to ArrayList time: " + addToList(arrayList));
        System.out.println("Add to LinkedList time: " + addToList(linkedList));
        System.out.println("Choose in ArrayList time: " + chooseElements(arrayList));
        System.out.println("Choose in LinkedList time: " + chooseElements(linkedList));
    }

    public static long addToList(List list) {
        long time = new Date().getTime();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return new Date().getTime() - time;
    }

    public static long chooseElements(List list) {
        long time = new Date().getTime();
        int k;
        for (int i = 0; i < 100000; i++) {
            k = (int) (1 + Math.random() * 1000000);
            list.get(k);
        }
        return new Date().getTime() - time;
    }
}
