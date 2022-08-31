package by.academy.classwork.lesson15.task2;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n, numb, q;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter number of lines: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Enter not number\nTry again: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n > 20000 || n < 1);
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        List<ArrayList<Integer>> query = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            int d;
            do {
                System.out.print("Enter number of columns for " + (i + 1) + " line: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Enter not number\nTry again: ");
                    scanner.next();
                }
                d = scanner.nextInt();
            } while (d > 50000 || d < 0);
            if (d == 0) {
                list.add(new ArrayList<>());
                continue;
            }
            System.out.print("Enter numbers: ");
            list.add(new ArrayList<>());
            for (int j = 0; j < d; j++) {
                numb = scanner.nextInt();
                list.get(i).add(numb);
            }
        }
        do {
            System.out.print("Enter number of query: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Enter not number\nTry again: ");
                scanner.next();
            }
            q = scanner.nextInt();
        } while (q > 1000 || q < 1);
        for (int i = 0; i < q; i++) {
            System.out.print("Enter x and y: ");
            query.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                numb = scanner.nextInt();
                query.get(i).add(numb);
            }
        }
        for (List<Integer> l : query) {
            try {
                System.out.println(list.get(l.get(0) - 1).get(l.get(1) - 1));
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("Error");
            }
        }
    }
}
