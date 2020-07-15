package by.academy.classwork.oop.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int columns, lines;
        Matrix mtrx = new Matrix();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк первой матрицы: ");
        lines = in.nextInt();
        System.out.print("Введите количество столбцов первой матрицы: ");
        columns = in.nextInt();
        Matrix mtrx1 = new Matrix(lines, columns);
        float m1[][] = new float[lines][columns];
        System.out.print("Введите количество строк второй матрицы: ");
        lines = in.nextInt();
        System.out.print("Введите количество столбцов второй матрицы: ");
        columns = in.nextInt();
        Matrix mtrx2 = new Matrix(lines, columns);
        float m2[][] = new float[lines][columns];
        mtrx1.add(m1);
        mtrx2.add(m2);
        mtrx.sumMatrix(m1, m2);
        mtrx.increase(m1, m2);
        System.out.print("Введите число на которое будет домножена матрица: ");
        int num = in.nextInt();
        mtrx.increase(m1, num);
    }
}
