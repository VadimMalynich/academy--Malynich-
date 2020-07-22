/*15. Условие здачи: ввести 2 слова, состоящие из четного числа букв. Получить слово состоящее из
первой половины первого слова и второй половины второго слова.*/
package by.academy.homework.homework2.strings;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str[] = new String[2];
        for (int i = 0; i < str.length; i++) {
            do {
                System.out.print("Введите слово с четным числом букв: ");
                str[i] = in.nextLine();
            } while (str[i].length() % 2 != 0);
        }
        System.out.println(str[0] + " " + str[1]);
        String test;
        test = str[0].substring(0, str[0].length() / 2) + str[1].substring(str[1].length() / 2);
        System.out.println("Итоговая строка: " + test);
    }
}
