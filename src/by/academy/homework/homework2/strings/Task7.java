/*7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.*/
package by.academy.homework.homework2.strings;

import java.util.Scanner;

public class Task7 {
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
        int count=0;
        for (int i = 0; i < str.length; i++) {
            int k = 0;
            for (int j = 0; j < str[i].length() - 1; j++) {
                for (int t = j + 1; t < str[i].length(); t++) {
                    if (str[i].charAt(j) == str[i].charAt(t)) {
                        k++;
                    }
                }
            }
            if (k == 0) {
                System.out.println("Слово: " + str[i]);
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Слов, состоящих только из различных символов нет!");
        }
    }
}
