package by.academy.Lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String month;
        month = in.next();
        switch(month){
            case "Январь":
                System.out.println(1);
                break;
            case "Февраль":
                System.out.println(2);
                break;
            case "Март":
                System.out.println(3);
                break;
            case "Апрель":
                System.out.println(4);
                break;
            case "Май":
                System.out.println(5);
                break;
            case "Июнь":
                System.out.println(6);
                break;
            case "Июль":
                System.out.println(7);
                break;
            case "Август":
                System.out.println(8);
                break;
            case "Сентябрь":
                System.out.println(9);
                break;
            case "Октябрь":
                System.out.println(10);
                break;
            case "Ноябрь":
                System.out.println(11);
                break;
            case "Декабрь":
                System.out.println(12);
                break;
            default:
                System.out.println("Неправильно введен месяц");
        }
    }
}
