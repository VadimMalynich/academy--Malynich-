package Homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String a;
        System.out.print("Введите тип данных: ");
        Scanner in = new Scanner(System.in);
        a=in.next();
        System.out.print("Введите переменную: ");
        switch(a){
            case "int":
                int b1;
                b1=in.nextInt();
                System.out.printf("Остаток от деления на 2: %d",b1%2);
                break;
            case"double":
                double b2;
                b2=in.nextDouble();
                b2*=0.7;
                System.out.println("70% от числа: "+b2);
                break;
            case"float":
                float b3;
                b3=in.nextFloat();
                System.out.printf("Квадрат числа: %f",Math.pow(b3,2));
                break;
            case"char":
                String b4;
                b4=in.next();
                System.out.print("Код переменной: ");
                for (int i=0; i<b4.length(); i++) {
                    char firstChar = b4.charAt(i);
                    int firstCharInt = (int) firstChar;
                    System.out.print(firstCharInt+" ");
                }
                break;
            case"string":
                String b5;
                b5=in.next();
                System.out.println("Hello "+b5);
                break;
            default:
                System.out.println("Unsupported type");
                break;
        }
        in.close();
    }
}
