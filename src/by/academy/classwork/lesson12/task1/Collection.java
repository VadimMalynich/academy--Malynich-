package by.academy.classwork.lesson12.task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Collection<T> {
    public void set(List<T> list) {
        HashSet<T> hs = new HashSet<>(list);
        for(T lst: list){
            hs.add(lst);
        }
        list.clear();
        for(T st: hs){
            list.add(st);
        }
    }
}
