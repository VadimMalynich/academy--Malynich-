package by.academy.classwork.Lesson2;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class Task1 {
    public static SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
//        System.out.println(calendar.getTimeInMillis());
//        java.util.Date date = new java.util.Date();
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//
//        StringBuilder builder = new StringBuilder("dwdsdasdqwd");
//        builder.insert(0, "999").append("200");
//        System.out.println(builder);
//        char[] v = {'a', 'w', 'd', 's', 'q'};
//        for (var i = 1; i <= v.length; i++) {
//            System.out.println(v[i] + " ");
//        }

//        int val = 10;
//        add(val);
//        System.out.println(val);
//
//        List<String> list = new ArrayList<>();
//        list.add("Apple");
//        list.add("Mango");
//        addElement(list);
//        System.out.println(list);
//
//        List<String> list2 = new ArrayList<>();
//        list2.add("Apple");
//        list2.add("Mango");
//        addElement2(list2);
//        System.out.println(list2);

        Double b = Double.parseDouble("6.6");
        Double c = Double.valueOf("6.6");
        Double d = Double.valueOf("6,6".replace(',', '.'));
        Double a = Double.parseDouble("6,6".replace(',', '.'));


        System.out.println(a + " " + b + " " + c + " " + d);

//        Byte a = 1;
//        Integer b = Integer.valueOf(a);
//        System.out.println(b);

//        Random random = new Random();
//        char[] word = new char[random.nextInt(11) + 10];
//        int rnd;
//        for (int i = 0; i < word.length; i++) {
//            rnd = random.nextInt(32) + 8;
//            System.out.println(rnd);
//            if (rnd == 36) {
//                word[i] = (char) (rnd);
//                i++;
//            }
//            word[i] = (char) (rnd);
//        }
//        for (int i = 0; i < word.length; i++) {
//            System.out.print(word[i]);
//        }

//        Scanner in  = new Scanner(System.in);
//        double d;
//        System.out.print("enter d: ");
//        d = in.nextDouble();
//        System.out.println(d);
//        System.out.println("Введите месяц: ");
//        String month;
//        month = in.next();
//        switch(month){
//            case "Январь":
//                System.out.println(1);
//                break;
//            case "Февраль":
//                System.out.println(2);
//                break;
//            case "Март":
//                System.out.println(3);
//                break;
//            case "Апрель":
//                System.out.println(4);
//                break;
//            case "Май":
//                System.out.println(5);
//                break;
//            case "Июнь":
//                System.out.println(6);
//                break;
//            case "Июль":
//                System.out.println(7);
//                break;
//            case "Август":
//                System.out.println(8);
//                break;
//            case "Сентябрь":
//                System.out.println(9);
//                break;
//            case "Октябрь":
//                System.out.println(10);
//                break;
//            case "Ноябрь":
//                System.out.println(11);
//                break;
//            case "Декабрь":
//                System.out.println(12);
//                break;
//            default:
//                System.out.println("Неправильно введен месяц");
//        }
    }

    private static void add(int a) {
        a *= 10;
    }

    private static void addElement(List<String> list) {
        list.add("Orange");
    }

    private static void addElement2(List<String> list) {
        list = new ArrayList<>();
        list.add("Orange");
    }
}
