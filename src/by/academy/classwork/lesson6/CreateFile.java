package by.academy.classwork.lesson6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateFile {
    private static final String symbols = "[-]?\\d+([.]\\d+)*";
    private static final String points = "[.|\\s]";
    private static final String letters = "[a-zA-z]";
    private static Pattern pattern = Pattern.compile(symbols);
    private static Pattern wrongCharPattern = Pattern.compile("[^-. 0-9]");

    public static void main(String[] args) {
//        int x1 = 2, x2 = 5, x3 = 5, y1 = 3, y2 = 3, y3 = 3;
//        if ((x1 != x2 && x1 != x3) || (y1 != y2 && y1 != y3)) {
//            System.out.println(1);
//        } else {
//            System.out.println(2);
//        }
//        List<Double> values = new ArrayList<>();
//        values.add(5.2);
//        values.add(4.0);
//        values.add(9.19);
//        Collections.sort(values);
//        if ((values.get(0) + values.get(1)) > values.get(2)) {
//            System.out.println(55);
//        }
//        System.out.println(values);
        createFile(new File("values.txt"));

//        List<Integer> integers = new ArrayList<>();
//        for (int i = 0; i < 9; i++) {
//            integers.add(i);
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(integers.get(i));
//        }
//        String str = "resources/text.txt";
//        String f = "values.txt";
//        Path path = Paths.get(f);
//        File file = new File(f);
//        int[][] matrix = new int[2][4];
//        List<String> lines = new ArrayList<>();
//       // createFile(f, file);
//        try (/*BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));*/
//                /*BufferedReader br = new BufferedReader(new FileReader(file))*/
//                Stream<String> lineStream = Files.lines(path)) {
//            lines = lineStream.collect(Collectors.toList());
//            System.out.println("/////");
////            for (int i = 0; i < matrix.length; i++) {
////                for (int j = 0; j < matrix[i].length; j++) {
////                    matrix[i][j] = Integer.parseInt(br.readLine());
////                    System.out.println(matrix[i][j]);
////                }
////            }
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
//        System.out.println(lines);
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    public static void createFile(File file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))) {
            int arr[] = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (-1000 + Math.random() * 2001);
                bw.write(String.valueOf(arr[i]));
                bw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
