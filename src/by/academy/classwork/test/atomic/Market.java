package by.academy.classwork.test.atomic;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Market extends Thread {
    private AtomicLong index;
    private Random generator = new Random();

    public Market(AtomicLong index) {
        this.index = index;
    }

    public AtomicLong getIndex() {
        return index;
    }

    @Override
    public void run() {
        try {
            while (true) {
               // index = Long.valueOf(generator.nextInt(21) - 10);
                index.addAndGet(generator.nextInt(21) - 10);
                Thread.sleep(generator.nextInt(500));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
