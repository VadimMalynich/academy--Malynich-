package by.academy.classwork.lesson12.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {2, 3, 4, 5, 6, null, null, null,55};
        CustomIterator<Integer> itr = new CustomIterator<>(array);
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        List<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(4);
        lst.add(2);
        lst.add(null);
        lst.add(1);
        Iterator<Integer> it = lst.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}