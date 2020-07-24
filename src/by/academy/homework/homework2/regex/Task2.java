package by.academy.homework.homework2.regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task2 {
    public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
    public static SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");
    public static SimpleDateFormat format3 = new SimpleDateFormat("d/M/yyyy HH:mm");

    public static void main(String[] args) throws ParseException {
        String[] test = new String[3];
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 3 даты: ");
        do {
            test[i] = in.next();
            i++;
        } while (i != 3);

        for (String t : test) {
            boolean isValid = Task1.isValidDateString(t);
            if (isValid) {
                try {
                    Date date = format1.parse(t);
                    System.out.println(date);
                    Calendar c = new GregorianCalendar();
                    c.setTime(date);
                    System.out.println("День: " + c.get(Calendar.DAY_OF_MONTH) + "\nМесяц: " + (c.get(Calendar.MONTH) + 1)
                            + "\nГод: " + c.get(Calendar.YEAR));
                } catch (Exception exception) {
                    Date date = format2.parse(t);
                    System.out.println(date);
                    Calendar c = new GregorianCalendar();
                    c.setTime(date);
                    System.out.println("День: " + c.get(Calendar.DAY_OF_MONTH) + "\nМесяц: " + (c.get(Calendar.MONTH) + 1)
                            + "\nГод: " + c.get(Calendar.YEAR));
                }
            }
        }
        in.close();
    }
}
