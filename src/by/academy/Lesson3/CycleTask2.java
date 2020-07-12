package by.academy.Lesson3;

import java.util.Scanner;

public class CycleTask2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n, sum=0;
        System.out.print("Введите число n: ");
        n=in.nextInt();
        for (int i=1;i<=n;i++){
            sum +=i;
        }
        System.out.print("Сумма чисел: "+ sum);
    }
}
