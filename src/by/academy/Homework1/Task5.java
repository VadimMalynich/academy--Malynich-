package by.academy.Homework1;

import java.io.IOException;
import java.util.Scanner;

public class Task5 {
        static int pairs(int k, int[] arr) {
            int pairsCount = 0;
            for (int i=0;i<arr.length;i++){
                for (int j=i+1;j<arr.length;j++){
                    if (Math.abs(arr[i]-arr[j])==k){
                        pairsCount++;
                    }
                }
            }
            return pairsCount;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            int n,k;
            do{
                System.out.print("Введите размер массива и target значение через пробел: ");
                String[] nk = scanner.nextLine().split(" ");
                n = Integer.parseInt(nk[0]);
                k = Integer.parseInt(nk[1]);
                if((n>=2&&n<=Math.pow(10,5))&&(k>0&&k<Math.pow(10,9))){
                    break;
                }
            } while(true);
            int[] arr = new int[n];
            do{
                int p=0,i, count=0;
                System.out.print("Введите значения массива через пробел: ");
                String[] arrItems = scanner.nextLine().split(" ");
                for (i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(arrItems[i]);
                    if (arr[i]>0&&arr[i]<(Math.pow(2,31)-1)){
                       p++;
                    }
                }
                for (i=0;i<arr.length;i++){
                    for (int j=i+1;j<arr.length;j++){
                        if (arr[i]==arr[j]){
                            count++;
                        }
                    }
                }
                if(count==0&&i==p){
                    break;
                }
            }while (true);
            System.out.print("Массив: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            int result = pairs(k, arr);
            System.out.println("\nКоличество пар = "+result);

            scanner.close();
        }
 }
