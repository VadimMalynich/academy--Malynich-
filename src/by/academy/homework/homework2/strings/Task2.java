/*2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания)
значений их длины.*/
package by.academy.homework.homework2.strings;

import java.util.Scanner;

public class Task2 {
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
        String temp;
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].length() > str[j].length()) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Строки упорядоченные по возрастанию:");
        for (int i = 0; i < str.length; i++) {
            System.out.println(i + ". " + str[i]);
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].length() < str[j].length()) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("\nСтроки упорядоченные по убыванию:");
        for (int i = 0; i < str.length; i++) {
            System.out.println(i + ". " + str[i]);
        }
        in.close();
    }
}
