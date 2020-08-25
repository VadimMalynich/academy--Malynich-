package by.academy.homework.homework5.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String folderPath = "./src/by/academy/homework/homework5/task3/users/";
        List<User> list = new ArrayList<>();
        User[] user = new User[10];
        user[0] = new User("Вася", "Пупкин", 15);
        user[1] = new User("Генадий", "Власов", 14);
        user[2] = new User("Саша", "Белов", 17);
        user[3] = new User("Влад", "Кузин", 12);
        user[4] = new User("Алиса", "Чудкина", 13);
        user[5] = new User("Милана", "Низова", 15);
        user[6] = new User("Леша", "Златов", 16);
        user[7] = new User("Алёна", "Мялик", 14);
        user[8] = new User("Гриша", "Савицкий", 10);
        user[9] = new User("Илья", "Стась", 16);
        list.addAll(Arrays.asList(user).subList(0, 10));
        String name = "Имя: ", surname = "Фамилия: ", age = "Возраст: ";
        for (User lst : list) {
            String path = folderPath + lst.getName() + "_" + lst.getSurname() + ".txt";
            try (BufferedWriter fos = new BufferedWriter(new FileWriter(path))) {
                String writeToFile = name + lst.getName() + "\n" + surname
                        + lst.getSurname() + "\n" + age + lst.getAge() + "\n";
                fos.write(writeToFile);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
