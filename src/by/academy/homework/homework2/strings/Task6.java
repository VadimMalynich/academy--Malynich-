/*6. Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке
возрастания их кодов. Если таких слов несколько, найти первое из них.*/
package by.academy.homework.homework2.strings;

import java.util.Scanner;

public class Task6 {
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

        for (int i = 0; i < str.length; i++) {
            int k = 0;
            for (int j = 0; j < str[i].length() - 1; j++) {
                if (str[i].charAt(j) <= str[i].charAt(j + 1)) {
                    k++;
                }
            }
            if (k + 1 == str[i].length()) {
                System.out.println("Слово: " + str[i]);
                break;
            }
        }
    }
}
