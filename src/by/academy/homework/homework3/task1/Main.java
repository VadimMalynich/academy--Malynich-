package by.academy.homework.homework3.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//[0]?[1-9]|    [0]?[1-9]||[1-9][1-9]
public class Main {
    public static Pattern p1 = Pattern.compile("^([0]?[0-9]|[1-9]|1[0-2])/([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])/\\d{4}");
    public static Pattern p2 = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0]?[1-9]|[1-9]|1[0-2])-\\d{4}");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month, year;
        String dt1, dt2, dt3;
        do {
            System.out.print("Введите дату формата дд-мм-гггг: ");
            dt1 = scanner.next();
        } while (!checkDate(dt1, p2));
        MyCustomDate date1 = new MyCustomDate(dt1);
        date1.getDayOfWeek();
        date1.countLeapYear(dt1);


        do {
            System.out.print("Введите день: ");
            day = scanner.nextInt();
        } while (day > 31 || day < 1);
        do {
            System.out.print("Введите месяц: ");
            month = scanner.nextInt();
        } while (month > 12 || month < 1);
        do {
            System.out.print("Введите год: ");
            year = scanner.nextInt();
        } while (year < 1);
        MyCustomDate date2 = new MyCustomDate(day, month, year);
        date2.getDayOfWeek();
        date2.countLeapYear(dt1);


        do {
            System.out.print("Введите начальную дату формата мм/дд/гггг: ");
            dt2 = scanner.next();
        } while (!checkDate(dt2, p1));
        do {
            System.out.print("Введите конечную дату формата мм/дд/гггг: ");
            dt3 = scanner.next();
        } while (!checkDate(dt3, p1));
        MyCustomDate.daysBetween(dt2, dt3);
        scanner.close();
    }

    public static boolean checkDate(String date, Pattern p) {
        Matcher matcher = p.matcher(date);
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
    }
}
