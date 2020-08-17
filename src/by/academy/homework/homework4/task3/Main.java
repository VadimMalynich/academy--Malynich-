package by.academy.homework.homework4.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        String str = "dad";
        char character[] = str.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();

        for (Character ch : character) {
            map.putIfAbsent(ch, i);
            int j = map.get(ch);
            map.put(ch, ++j);
        }

        for (Map.Entry<Character, Integer> mp : map.entrySet()) {
            System.out.println("Character: " + mp.getKey() + ". Number of repetitions: " + mp.getValue());
        }
    }
}