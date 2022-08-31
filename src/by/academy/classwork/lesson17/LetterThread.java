package by.academy.classwork.lesson17;

public class LetterThread extends Thread {
    StringBuilder stringBuilder;

    /*private static final LetterThread instance = new LetterThread();

    public static LetterThread getInstance(StringBuilder stringBuilder) {
        return instance;
    }*/

    public LetterThread() {
    }

    public LetterThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.println(getStringBuilder());
                String s = stringBuilder.toString() + "a";
                stringBuilder = new StringBuilder(s);
            }
        }
    }
}
