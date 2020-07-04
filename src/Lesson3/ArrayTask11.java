package Lesson3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayTask11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int enter, sum1=0, sum2=0;
        do{
            System.out.print("Введите четное положительное число: ");
            enter=in.nextInt();
        }while(enter%2!=0 || enter<=0);
        int arr[]=new int [enter];
        System.out.print("Массив: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=(int)(-6+Math.random()*12);
            System.out.print(arr[i]+" ");
        }
        //System.out.println();
        for(int i=0;i<arr.length/2;i++){
            sum1+=Math.abs(arr[i]);
            //System.out.print(arr[i]+" ");
        }
        //System.out.println();
        for(int i=arr.length/2;i<arr.length;i++){
            sum2+=Math.abs(arr[i]);
            //System.out.print(arr[i]+" ");
        }
        if(sum1==sum2){
            System.out.println("\nСуммы равны");
        }else if(sum1>sum2){
            System.out.println("\nСумма первой половины больше");
        }else{
            System.out.println("\nСумма второй половины больше");
        }
        in.close();

    }
}
