/*13. Написать программу, позволяющую корректно находить корни квадратного уравнения.
Параметры уравнения должны задаваться с ко-мандной строки.*/
package by.academy.homework.homework2.strings;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        double a, b, c;
        double result;
        System.out.println("Введите параметры a, b, c для решения уравнения a*x^2+b*x+c=0. ");
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        a = in.nextDouble();
        System.out.print("b: ");
        b = in.nextDouble();
        System.out.print("c: ");
        c = in.nextDouble();
        if (a == 0) {
            result = -c / b;
            System.out.println("x= " + result);
        } else if (b == 0) {
            result = -c / Math.pow(a, 2);
            System.out.println("x= " + result);
        } else {
            double d;
            d = Math.pow(b, 2) - 4 * a * c;
            if (d < 0) {
                System.out.println("Нет корней!");
            } else if (d == 0) {
                result = -b / (2 * a);
                System.out.println("x1 = x2 = " + result);
            } else {
                result = -(b + Math.sqrt(d)) / (2 * a);
                System.out.println("x1= " + result);
                result = -(b - Math.sqrt(d)) / (2 * a);
                System.out.println("x2= " + result);
            }
        }
        in.close();
    }
}