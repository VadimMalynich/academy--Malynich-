package by.academy.classwork.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Quest6 {

    public static void main(String[] args) {
//        Date d = new Date();
//        Locale[ ] locales = DateFormat.getAvailableLocales();
//        for (Locale loc : locales) {
//            DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, loc);
//            System.out.println(loc.toString() + "---> " + df.format(d));
//        }
        new Thread(()-> {
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end of Thread");
        }).start();
        try {
            TimeUnit.MILLISECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(Boolean.TRUE) {
            throw new RuntimeException();
        }
        System.out.println("end of main thread");


    }
}

