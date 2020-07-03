package Homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int age;
        double sum;
        do{
            System.out.print("Введите сумму покупки: ");
            sum=in.nextDouble();
        }while(sum<0);
        do{
            System.out.print("\nВведите возраст: ");
            age=in.nextInt();
        }while(age<0);
        if (sum<100){
            sum*=0.95;
        }else if(sum<200){
            sum*=0.93;
        }else if(sum<300){
            if (age>18){
                sum*=0.84;
            }else {
                sum*=0.91;
            }
        }else if(sum<400){
           sum*=0.85;
        }else{
            sum*=0.8;
        }
        System.out.println("Итоговая сумма: "+sum);
        Scanner close;
    }
}
