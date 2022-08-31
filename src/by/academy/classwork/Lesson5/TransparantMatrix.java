package by.academy.classwork.Lesson5;

import java.util.Scanner;

public class TransparantMatrix {
    public static void main(String[] args) {
        Integer rows;
        Integer columns;
        Integer[][] mtrx;
        Integer[][] temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix rows");
        while (!scanner.hasNextInt()) {
            System.out.print("No number entered\nTry again: ");
            scanner.next();
        }
        rows = scanner.nextInt();
        System.out.println("Enter matrix columns");
        while (!scanner.hasNextInt()) {
            System.out.print("No number entered\nTry again: ");
            scanner.next();
        }
        columns = scanner.nextInt();
        mtrx = new Integer[rows][columns];
        temp = new Integer[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mtrx[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                temp[i][j] = mtrx[j][i];
            }
        }
        System.out.println("Normal matrix");
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                System.out.printf("%2d ", mtrx[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transposed matrix");
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.printf("%2d ", temp[i][j]);
            }
            System.out.println();
        }

    }
}
