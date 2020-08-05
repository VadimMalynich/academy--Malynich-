package by.academy.classwork.lesson12.task5;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<HeavyBox> hb = new TreeSet<>();
        HeavyBox heavyBox1 = new HeavyBox(5, 2, 1, 10000);
        HeavyBox heavyBox2 = new HeavyBox(2, 10, 4, 23);
        HeavyBox heavyBox3 = new HeavyBox(1, 6, 20, 984);
        hb.add(heavyBox1);
        hb.add(heavyBox2);
        hb.add(heavyBox3);

        for (HeavyBox it : hb) {
            System.out.println(it.getWeight() + " ");
        }

//        heavyBox[0].add(5, 2, 1, 10000);
//        heavyBox[1].add(2, 10, 4, 23);
//        heavyBox[2].add(1, 6, 20, 984);
//        hb.add(heavyBox[0]);
//        hb.add(heavyBox[1]);
//        hb.add(heavyBox[2]);
//
//        for (HeavyBox it : hb) {
//            System.out.println(it.getWeight());
//        }


    }
}