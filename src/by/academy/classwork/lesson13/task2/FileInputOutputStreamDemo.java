package by.academy.classwork.lesson13.task2;

import java.io.*;

/*Переписать класс FileInputOutputStreamDemo:
	a) Добавить блок try-with-resources.
	б) Замените for (int i = 0; i < c.length; i++) на блок for-each.
	в) Пусть file.txt записывается в каталог src/io. (Задание с урока)*/
public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try (BufferedWriter br1 = new BufferedWriter(new FileWriter("./src/file.txt"));
             BufferedReader br2 = new BufferedReader(new FileReader("a.txt"))) {
            String str = "How the weather?";
            char[] symbols = str.toCharArray();
            for (char i : symbols) {
                br1.write(i);
            }
            while (br2.ready()){
                System.out.print((char) br2.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
