/*5. Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского
алфавита, а среди них – количество слов с равным числом гласных и согласных букв.*/
package by.academy.homework.homework2.strings;

import java.util.Scanner;

public class Task5 {
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
        int latinWords = 0;
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            int k = 0;
            for (int j = 0; j < str[i].length(); j++) {
                if ((str[i].charAt(j) >= 65 && str[i].charAt(j) <= 90) || (str[i].charAt(j) >= 97 && str[i].charAt(j) <= 122)) {
                    k++;
                }
            }
            if (k == str[i].length()) {
                int lettersVowels = 0;
                int lettersСonsonants = 0;
                latinWords++;
                for (int j = 0; j < str[i].length(); j++) {
                    if (str[i].charAt(j) == 65 || str[i].charAt(j) == 69 || str[i].charAt(j) == 73 || str[i].charAt(j) == 79
                            || str[i].charAt(j) == 85 || str[i].charAt(j) == 89 || str[i].charAt(j) == 97 || str[i].charAt(j) == 101
                            || str[i].charAt(j) == 105 || str[i].charAt(j) == 111 || str[i].charAt(j) == 117 || str[i].charAt(j) == 121) {
                        lettersVowels++;
                    } else {
                        lettersСonsonants++;
                    }
                }
                if (lettersVowels == lettersСonsonants) {
                    count++;
                }
            }
        }
        System.out.println("\nКоличество слов содержащих только латинский алфавит: " + latinWords);
        System.out.println("Количество слов в котором количество гласных и согласных одинаково: " + count);
    }
}