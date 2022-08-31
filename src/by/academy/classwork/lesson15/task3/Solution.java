package by.academy.classwork.lesson15.task3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    static boolean isAnagram(String a, String b) {
        /*int i = 0;
        char a1[] = a.toLowerCase().toCharArray();
        char b1[] = b.toLowerCase().toCharArray();
        Map<Character, Integer> mapA = new TreeMap<>();
        Map<Character, Integer> mapB = new TreeMap<>();
        for (Character c : a1) {
            mapA.putIfAbsent(c, i);
            int j = mapA.get(c);
            mapA.put(c, ++j);
        }
        for (Character c : b1) {
            mapB.putIfAbsent(c, i);
            int j = mapB.get(c);
            mapB.put(c, ++j);
        }
        String strA = mapA.toString();
        String strB = mapB.toString();
        System.out.println(strA + " " + strB);
        if (strA.equals(strB)) {
            return true;
        } else {
            return false;
        }*/
        char a1[] = a.toLowerCase().toCharArray();
        char b1[] = b.toLowerCase().toCharArray();
        boolean isSorted = false;
        char buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < a1.length - 1; i++) {
                if (a1[i] > a1[i + 1]) {
                    isSorted = false;
                    buf = a1[i];
                    a1[i] = a1[i + 1];
                    a1[i + 1] = buf;
                }
            }
        }
        isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < b1.length - 1; i++) {
                if (b1[i] > b1[i + 1]) {
                    isSorted = false;
                    buf = b1[i];
                    b1[i] = b1[i + 1];
                    b1[i + 1] = buf;
                }
            }
        }
        String strA = "";
        for (Character c : a1) {
            strA = strA + Character.toString(c);
        }
        String strB = "";
        for (Character c : b1) {
            strB = strB + Character.toString(c);
        }
        if (strA.equals(strB)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
