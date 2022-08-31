package by.academy.classwork.lesson16.task2;

public class Running implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 100; i++) {
                if (i % 10 == 0) {
                    System.out.println(i);
                    Thread.sleep(100);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}