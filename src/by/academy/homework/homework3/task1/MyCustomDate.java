package by.academy.homework.homework3.task1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyCustomDate {
    private String stringDate;
    private Calendar date = null;

    static class Day {
        private int day;

        public Day(int day) {
            this.day = day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }
    }

    static class Month {
        private int month;

        public Month(int month) {
            this.month = month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }
    }

    static class Year {
        private int year;

        public Year(int year) {
            this.year = year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }
    }

    public MyCustomDate() {
        super();
    }

    public MyCustomDate(String str) {
        String temp;
        temp = str.substring(0, str.indexOf('-'));
        int date1 = Integer.parseInt(temp);
        Day day = new Day(date1);
        temp = str.substring(str.indexOf('-') + 1, str.lastIndexOf('-'));
        int date2 = Integer.parseInt(temp);
        Month month = new Month(date2);
        temp = str.substring(str.lastIndexOf('-') + 1, str.length());
        int date3 = Integer.parseInt(temp);
        Year year = new Year(date3);
        this.stringDate = str;
        this.date = new GregorianCalendar(date3, date2 - 1, date1);
        countLeapYear(year.getYear());
    }

    public MyCustomDate(int d, int m, int y) {
        Day day = new Day(d);
        Month month = new Month(m);
        Year year = new Year(y);
        String str = d + "-" + m + "-" + y;
        this.stringDate = str;
        this.date = new GregorianCalendar(y, m - 1, d);
        countLeapYear(year.getYear());
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(String str) {
        String temp;
        temp = str.substring(0, str.indexOf('-'));
        int date1 = Integer.parseInt(temp);
        Day day = new Day(date1);
        temp = str.substring(str.indexOf('-') + 1, str.lastIndexOf('-'));
        int date2 = Integer.parseInt(temp);
        Month month = new Month(date2);
        temp = str.substring(str.lastIndexOf('-') + 1, str.length());
        int date3 = Integer.parseInt(temp);
        Year year = new Year(date3);
        this.stringDate = str;
        this.date = new GregorianCalendar(date3, date2 - 1, date1);
    }

    public String getStringDate() {
        return stringDate;
    }

    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }

    public void getDayOfWeek() {
        Date date = getDate().getTime();
        String dayOfWeek = date.toString().substring(0, 3);
        switch (dayOfWeek) {
            case "Mon":
                System.out.println(getStringDate() + " был " + DayOfWeek.MON.getValue());
                break;
            case "Tue":
                System.out.println(getStringDate() + " был " + DayOfWeek.TUE.getValue());
                break;
            case "Wed":
                System.out.println(getStringDate() + " была " + DayOfWeek.WED.getValue());
                break;
            case "Thu":
                System.out.println(getStringDate() + " был " + DayOfWeek.THU.getValue());
                break;
            case "Fri":
                System.out.println(getStringDate() + " была " + DayOfWeek.FRI.getValue());
                break;
            case "Sat":
                System.out.println(getStringDate() + " была " + DayOfWeek.SAT.getValue());
                break;
            case "Sun":
                System.out.println(getStringDate() + " было " + DayOfWeek.SUN.getValue());
                break;
            default:
                System.out.println("Ошибка!");
                break;
        }
    }

    public static void daysBetween(String str1, String str2) {
        long count;
        Date date1 = new Date(str1);
        Date date2 = new Date(str2);
        if (date1.before(date2)) {
            count = (date2.getTime() - date1.getTime()) / (1000 * 3600 * 24);
        } else {
            count = (date1.getTime() - date2.getTime()) / (1000 * 3600 * 24);
        }
        System.out.println("Между датами " + str1 + " и " + str2 + "\t" + count + " дней!");
    }

    private void countLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный!");
        }
    }

    public void countLeapYear(String str) {
        String temp = str.substring(str.lastIndexOf('-') + 1, str.length());
        int date = Integer.parseInt(temp);
        if ((date % 4 == 0 && date % 100 != 0) || (date % 4 == 0 && date % 100 == 0 && date % 400 == 0)) {
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный!");
        }
    }
}