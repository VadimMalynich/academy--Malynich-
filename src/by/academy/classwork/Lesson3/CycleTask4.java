package by.academy.classwork.Lesson3;

import java.util.Scanner;

public class CycleTask4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n;
        int numb[];
        int positive=0, negative=0, zero=0;
        //long sum=1L;
        System.out.print("Введите количество чисел n: ");
        n=in.nextInt();
        numb=new int[n];
        System.out.print("Enter numbers: ");
        for (int i=0;i<numb.length;i++){
            numb[i]=in.nextInt();
        }
        for(int i=0;i<numb.length;i++){
            if(numb[i]==0){
                zero++;
                continue;
            }
            if(numb[i]>=0){
                positive++;
                continue;
            }
            if(numb[i]<=0){
                negative++;
                continue;
            }
        }
        System.out.println("Положительных чисел: "+positive);
        System.out.println("Отрицательных чисел: "+negative);
        System.out.println("Количество нулей: "+zero);
    }
}
