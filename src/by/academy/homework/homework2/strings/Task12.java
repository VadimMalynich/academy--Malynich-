/*12. Написать программу, которая выводит числа от 1 до 25 в виде матрицы 5x5 слева направо и сверху вниз.*/
package by.academy.homework.homework2.strings;

public class Task12 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
