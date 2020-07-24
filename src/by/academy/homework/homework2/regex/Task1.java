package by.academy.homework.homework2.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static Pattern p1 = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])/([0]?[0-9]|[1-9]|1[0-2])/\\d{4}");
    public static Pattern p2 = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0]?[1-9]|[1-9]|1[0-2])-\\d{4}");

    public static void main(String[] args) {

        String[] test1 = {"50/50/9999", "00/00/0000", "3/02/2020", "9/9/2020", "1-9-1980"};
        String[] test2 = {"50-50-9999", "00-00-0000", "13-12-2020", "9-9-2020", "1-9-1980"};

        for (String t : test1) {
            Matcher m1 = p1.matcher(t);
            if (m1.find()) {
                System.out.println(m1.group(0));
            } else {
                System.out.println("Failed");
            }
        }
        System.out.println();
        for (String t : test2) {
            Matcher m2 = p2.matcher(t);
            if (m2.find()) {
                System.out.println(m2.group(0));
            } else {
                System.out.println("Failed");
            }
        }
    }

    public static boolean isValidDateString(String stringDates) {
        Matcher m1 = p1.matcher(stringDates);
        if (m1.find()) {
            return true;
        }
        Matcher m2 = p2.matcher(stringDates);
        if (m2.find()) {
            return true;
        }
        return false;
    }
}
