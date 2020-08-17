package by.academy.homework.homework4.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lst.add((int) (1 + Math.random() * 10));
        }
        int max = lst.get(0);
        Iterator<Integer> it = lst.iterator();
        for (Integer integer : lst) {
            if (max < integer) {
                max = integer;
            }
        }
        System.out.println("Max mark: " + max);
    }
}
