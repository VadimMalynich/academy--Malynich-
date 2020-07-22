/*1. Ввести n строк с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.*/
package by.academy.homework.homework2.strings;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        do {
            System.out.print("Введите количество строк >2: ");
            n = in.nextInt();
        } while (n <= 1);
        String str[] = new String[n];
        in.skip("\n");
        for (int i = 0; i < str.length; i++) {
            System.out.print("Введите строку: ");
            str[i] = in.nextLine();
        }
        String min = str[0];
        String max = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() > max.length()) {
                max = str[i];
            }
            if (str[i].length() < min.length()) {
                min = str[i];
            }
        }
        System.out.println("Наибольшая строка: " + max);
        System.out.println("Длина: " + max.length());
        System.out.println("Наименьшая строка: " + min);
        System.out.println("Длина: " + min.length());

        in.close();
    }
}