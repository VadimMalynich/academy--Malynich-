package by.academy.homework.homework5.task1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку для прекращения работы введите\"stop\": ");
        String stop = "stop";
        Scanner scanner = new Scanner(System.in);
        String str = "";
        String path = "./src/by/academy/homework/homework5/task1/result.txt";
        do {
            str = str + scanner.nextLine()+"\n";
        } while (!str.contains(stop));
        int index = str.indexOf(stop);
        String writeToFile = str.substring(0, index);
        writeToFile(path, writeToFile);
        scanner.close();
    }

    public static void writeToFile(String path, String str) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            char symbols[] = str.toCharArray();
            for (char s : symbols) {
                bw.write(s);
            }
            System.out.println("Данные успешно записаны в файл");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
