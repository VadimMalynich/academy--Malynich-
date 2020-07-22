/*4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
Если таких слов несколько, найти первое из них.*/
package by.academy.homework.homework2.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
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
        int indexMinUnique = -1;
        int minUniqueChars = Integer.MAX_VALUE;

        for (int i = 0; i < str.length; i++) {

            int currentUniqueCounter = 0;
            char[] cArr = new char[65538];
            for (char c : str[i].toCharArray()) {
                cArr[c]++;
            }
            for (char c : cArr) {
                if (c > 0) {
                    currentUniqueCounter++;
                }
            }
            if (currentUniqueCounter < minUniqueChars) {
                minUniqueChars = currentUniqueCounter;
                indexMinUnique = i;
            }

        }
        System.out.println(str[indexMinUnique]);
        in.close();


        ////////////////////////////////////////////////////////
       /* Scanner in = new Scanner(System.in);

        int n;
        do {
            System.out.print("Введите количество слов >2: ");
            n = in.nextInt();
        } while (n <= 1);
        String str[] = new String[n];
        in.skip("\n");
        System.out.print("Введите " + n + " слов: ");
        int length = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
            if (length < str[i].length()) {
                length = str[i].length();
            }
        }
        int arr[][] = new int[n][length];
        *//*int min = str[n - 1].length();
        int count = str.length - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (str[i].length() <= min) {
                min = str[i].length();
                count = i;
            }
        }*//*
        int count[][] = new int[n][1];
        int k = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                for (int t = 0; t < str[i].length(); t++) {
                    if(str[i][j]==str[i][t]){
                        for (int num = j; k < str[i].length() - 1; k++) {
                            arr[i][num] = arr[i][num + 1];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                for (int t = 0; t < str[i].length(); t++) {
                    if(arr[i][j]==arr[i][t]){
                        for (int num = j; k < str[i].length() - 1; k++) {
                            arr[i][num] = arr[i][num + 1];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            //for (int j = 0; j < str[i].length(); j++) {
            k = 0;
            int size = str[i].length()-1;
            while (size!=0) {
                if (arr[i][0] != arr[i][size]) {
                    count[i][0] = ++k;
                }
                size--;
            }
                *//*for (int t = 0; t < str[i].length(); t++) {
                    if (arr[i][j] == arr[i][t]) {
                       break;
                    }
                    count[i][0] = k++;
                }*//*
            // }
        }
        k = 0;
        int min = count[0][0];
        System.out.println();
        for (int i = count.length - 1; i >= 0; i--) {
            if (min >= count[i][0]) {
                min = count[i][0];
                k = i;
            }
        }

        System.out.println("Строка: " + str[k]);
        in.close();*/


        //////////////////////////////////////////////////////
       /* System.out.println("Ââåäèòå ñëîâà â ñòðîêó ÷åðåç ïðîáåë:");
        Scanner sc = new Scanner(System.in);
        String string = new String();
        string = sc.nextLine();
        sc.close();
        String[] words = string.split(" +");
        if (words.length <= 1) {
            System.out.println("Cëîâî, â êîòîðîì ÷èñëî ðàçëè÷íûõ" + " ñèìâîëîâ ìèíèìàëüíî: " + string);
        } else {
            int[] unics = new int[words.length];
            for (int i = 0; i < words.length; i++) {

                for (int j = 0; j < words[i].length(); j++) {
                    if (words[i].lastIndexOf(words[i].charAt(j)) == j) {
                        unics[i]++;
                    }
                }
            }
            int unicsMin = unics[0];
            for (int i = 1; i < unics.length; i++) {
                if (unicsMin > unics[i]) {
                    unicsMin = unics[i];
                }
            }
            for (int i = 0; i < unics.length; i++) {
                if (unics[i] == unicsMin) {
                    System.out.println("Cëîâî, â êîòîðîì ÷èñëî ðàçëè÷íûõ" + " ñèìâîëîâ ìèíèìàëüíî: " + words[i]);
                    break;
                }
            }
        }*/
    }
}