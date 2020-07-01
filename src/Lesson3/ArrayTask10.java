package Lesson3;

import java.sql.SQLOutput;

public class ArrayTask10 {
    public static void main(String[] args) {
        int arr[] = new int[11];
        int n = 0, k = 0, p = 0, max;
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-2 + Math.random() * 4);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case -1:
                    n++;
                    break;
                case 0:
                    k++;
                    break;
                case 1:
                    p++;
                    break;
            }
        }
        max = n;
        if (n == k || n == p || k == p) {
            //System.out.println("\nНичего");
            return;
        }
        if (max < k) {
            max = k;
            if (max > p) {
                System.out.println("\nЧаще встречается 0");
            } else {
                System.out.println("\nЧаще встречается 1");
            }
        } else {
            System.out.println("\nЧаще встречается -1");
        }
    }
}
