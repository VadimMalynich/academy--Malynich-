package by.academy.classwork.lesson12.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (0 + Math.random() * 10));
        }
        Collection<Integer> collection = new Collection<>();
        System.out.println("List before we call method:");
        System.out.println(list);
        collection.set(list);
        System.out.println("List after we call method:");
        System.out.println(list);
    }
}
