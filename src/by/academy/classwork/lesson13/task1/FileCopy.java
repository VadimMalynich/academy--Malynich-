package by.academy.classwork.lesson13.task1;

import java.io.*;

/*Переписать класс FileCopy:
	a) Добавить блок try-with-resources.
	б) Добавить catch блок для обработки IOException. (Задание с урока)*/
public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = null;
        try (/*BufferedReader br1 = new BufferedReader(new FileReader("file.txt"));
        BufferedWriter br2 = new BufferedWriter(new FileWriter("copied_file.txt"))*/
                FileInputStream br1 = new FileInputStream("file.txt");
                FileOutputStream br2 = new FileOutputStream("copied_file.txt")
        ) {
            int a;
            while ((a = br1.read()) != -1) {
                br2.write(a);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}