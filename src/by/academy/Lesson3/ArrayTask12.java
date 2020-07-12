package by.academy.Lesson3;

import java.util.Random;

public class ArrayTask12 {
    public static void main(String args[]){
        int arr[]=new int [12];
        int a=0, b=0;
        Random rand = new Random();
        for (int i=0;i<arr.length;i++){
            if (a==6){
                arr[i]=(int)(-11+Math.random()*10);
                continue;
            }
            if (b == 6) {
                arr[i]=(int)(1+Math.random()*10);
                continue;
            }
            arr[i]=(int)(-11+Math.random()*22);
            if(arr[i]==0){
                i--;
            }else if(arr[i]>0){
                a++;
            } else{
                b++;
            }
        }
        System.out.print("Массив: ");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
