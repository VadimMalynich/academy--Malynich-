package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class BaseArray {
    public static void main(String args[]){
        int a, sum=0, s;
        Scanner in  = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        a=in.nextInt();
        int arr[];
        arr=new int [a];
        Random rand = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(100);
            sum+=arr[i];
        }
        s=sum/arr.length;
        System.out.println("Average: " + s);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Numbs: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<s){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
