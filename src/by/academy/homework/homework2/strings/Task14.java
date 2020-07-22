/*14. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
(Осуществить проверку корректности ввода чисел).*/
package by.academy.homework.homework2.strings;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month;
        do {
            System.out.print("Введите число от 1 до 12: ");
            while (!in.hasNextInt()) {
                System.out.println("Введено не число!\nПовторите попытку: ");
                in.next();
            }
            month = in.nextInt();
        } while ((month > 12 || month < 1));
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Неправильно введен месяц");
                break;
        }
        in.close();
    }
}
