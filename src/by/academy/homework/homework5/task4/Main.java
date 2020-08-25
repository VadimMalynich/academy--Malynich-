package by.academy.homework.homework5.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "./src/by/academy/homework/homework5/task2/text.txt";
        String folderPath = "./src/by/academy/homework/homework5/task4/files/";
        String resultPath = "./src/by/academy/homework/homework5/task4/result.txt";
        File f = new File(resultPath);
        if(f.isFile()){
            f.delete();
        }
        String str = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            str = br.readLine();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        int[] arr = new int[100];
        int j = 1;
        for (int i = 0; i < 100; i++) {
            String filePath = folderPath + j++ + ".txt";
            int size = (int) (0 + Math.random() * 574);
            String writeToFile = str.substring(0, size);
            arr[i] = writeToFile.length();
            try (BufferedWriter br = new BufferedWriter(new FileWriter(filePath))) {
                br.write(writeToFile);
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
        j = 1;
        for (int i = 0; i < 100; i++) {
            String filePath = folderPath + j++ + ".txt";
            File file = new File(filePath);
            String result;
            try (BufferedWriter br = new BufferedWriter(new FileWriter(resultPath, true))) {
                result = filePath + " | text length: " + arr[i] + " | file size " + file.length() + "\n";
                br.write(result);
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
