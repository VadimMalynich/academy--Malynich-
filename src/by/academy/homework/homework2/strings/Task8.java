/*8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
Если таких слов больше одного, найти второе из них.*/
package by.academy.homework.homework2.strings;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите количество слов >2: ");
            n = in.nextInt();
        } while (n <= 1);
        String str[] = new String[n];
        in.skip("\n");
        System.out.print("Введите " + n + " слов: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        int palindrom = 0;
        int temp = -2;
        for (int i = 0; i < str.length; i++) {
            int k = 0;
            int count = 0;
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) >= 48 && str[i].charAt(j) <= 57) {
                    k++;
                }
            }
            if (k == str[i].length()) {
                for (int j = 0; j < (str[i].length() / 2); j++) {
                    if (str[i].charAt(j) == str[i].charAt(str[i].length() - 1 - j)) {
                        count++;
                    }
                }
                if (count == (str[i].length() / 2)) {
                    palindrom++;
                    temp = i;
                    if (palindrom == 2) {
                        System.out.println("Второй палиндром: " + str[i]);
                        temp = -1;
                        break;
                    }
                }
            }
        }
        if (temp >= 0) {
            System.out.println("Палиндром: " + str[temp]);
        } else if (temp == -2) {
            System.out.println("Нет палиндромов!");
        }
    }
}
