package by.academy.classwork.lesson15.task1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Британец", 5, "Вася");
        Tiger tiger = new Tiger(20, "Niger", "Park");
        Class<Cat> catClass = Cat.class;
        Class<? extends Cat> tigerClass = tiger.getClass();
        try {
            Method catMethods[] = catClass.getDeclaredMethods();
            Field catField[] = catClass.getDeclaredFields();
            Method tigerMethods[] = tigerClass.getDeclaredMethods();
            Field tigerField[] = tigerClass.getDeclaredFields();
            Field catBreed = catClass.getDeclaredField("breed");
            Field tigerCountry = tigerClass.getDeclaredField("country");
            catBreed.setAccessible(true);
            catBreed.set(cat, "Сиамский");
            tigerCountry.set(tiger, "Russia");
            String str;
            for (Field m : catField) {
                System.out.println(m);
            }
            System.out.println();
            for (Method m : catMethods) {
                System.out.println(m);
            }
            System.out.println();
            for (Field m : tigerField) {
                System.out.println(m);
            }
            System.out.println();
            for (Method m : tigerMethods) {
                System.out.println(m);
            }
            System.out.println();
            for (Field f : catField) {
                f.setAccessible(true);
                try{
                    str = (String) f.get(cat);
                    System.out.println(str);
                }catch (Exception e){
                    Integer t = (Integer) f.get(cat);
                    System.out.println(t);
                }
            }
            System.out.println();
            for (Field f : tigerField) {
                f.setAccessible(true);
                try{
                    str = (String) f.get(tiger);
                    System.out.println(str);
                }catch (Exception e){
                    Integer t = (Integer) f.get(tiger);
                    System.out.println(t);
                }
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
