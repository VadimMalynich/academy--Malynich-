/*3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше)
средней, а также длину.*/
package by.academy.homework.homework2.strings;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        do {
            System.out.print("Введите количество строк >2: ");
            n = in.nextInt();
        } while (n <= 1);
        String str[] = new String[n];
        in.skip("\n");
        float length = 0;
        for (int i = 0; i < str.length; i++) {
            System.out.print("Введите строку: ");
            str[i] = in.nextLine();
            length += str[i].length();
        }
        length = length / str.length;
        System.out.println("\nСтроки длина которых меньше средней длины " + length + ": ");
        for (int i = 0; i < str.length; ++i) {
            if (str[i].length() < length) {
                System.out.println(str[i] + ". Длина: " + str[i].length());
            }
        }
        System.out.println("\nСтроки длина которых больше средней длины " + length + ": ");
        for (int i = 0; i < str.length; ++i) {
            if (str[i].length() > length) {
                System.out.println(str[i] + ". Длина: " + str[i].length());
            }
        }

        in.close();
    }
}