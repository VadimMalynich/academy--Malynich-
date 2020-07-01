package Lesson2;

public class Task4 {
    public static void main(String[] args) {
        int s = 865459;
        int sec;
        int m;
        int min, h;
        int hour;
        int day, d;
        int week, w;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        w = (d - day) / 7;
        week = w % 4;
        System.out.println(week+ " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
    }
}
