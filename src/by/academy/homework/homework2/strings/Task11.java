/*11. Используя оператор switch, написать программу, которая выводит на экран сообщения о
принадлежности некоторого значения k интервалам (-10k, 5], [0, 10], [5, 15], [10, 10k].*/
package by.academy.homework.homework2.strings;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k;
        System.out.print("Введите число: ");
        k = in.nextInt();
        int m = -1;
        if (k > -10000 && k < 0) {
            m = 0;
        } else if (k >= 0 && k < 5) {
            m = 1;
        } else if (k == 5) {
            m = 2;
        } else if (k > 5 && k < 10) {
            m = 3;
        } else if (k == 10) {
            m = 4;
        } else if (k > 10 && k <= 15) {
            m = 5;
        } else if (k > 15 && k <= 10000) {
            m = 6;
        }

        switch (m) {
            case 0:
                System.out.println("Число " + k + " принадлежит промежутку (-10k, 5]");
                break;
            case 1:
                System.out.println("Число " + k + " принадлежит промежуткам (-10k, 5], [0, 10]");
                break;
            case 2:
                System.out.println("Число " + k + " принадлежит промежуткам (-10k, 5], [0, 10], [5, 15]");
                break;
            case 3:
                System.out.println("Число " + k + " принадлежит промежуткам [0, 10], [5, 15]");
                break;
            case 4:
                System.out.println("Число " + k + " принадлежит промежуткам [0, 10], [5, 15], [10, 10k]");
                break;
            case 5:
                System.out.println("Число " + k + " принадлежит промежуткам [5, 15], [10, 10k]");
                break;
            case 6:
                System.out.println("Число " + k + " принадлежит промежутку [10, 10k]");
                break;
            default:
                System.out.println("Число не принадлежит ни одному из промежутков!");
                break;
        }
        in.close();
    }
}
