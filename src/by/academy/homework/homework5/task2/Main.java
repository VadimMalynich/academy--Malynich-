package by.academy.homework.homework5.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path1 = "./src/by/academy/homework/homework5/task2/text.txt";
        String path2 = "./src/by/academy/homework/homework5/task2/result.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2));
             BufferedReader br = new BufferedReader(new FileReader(path1))) {
            List<Character> str = new ArrayList<>();
            int a;
            while ((a = br.read()) != -1) {
                if (a == ' ') {
                    continue;
                }
                str.add((char) a);
            }
            for (Character c : str) {
                bw.write(c);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}