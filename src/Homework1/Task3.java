package Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Введите число от 1 до 10: ");
            num=in.nextInt();
        }while (num>10||num<1);
        System.out.println("Таблица усножения для числа "+num);
        for (int i=1;i<11;i++){
            System.out.print(i*num+" ");
        }

        in.close();
    }
}
