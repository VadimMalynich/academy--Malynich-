package by.academy.classwork.lesson17;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");
        LetterThread lt1 = new LetterThread(stringBuilder);
        LetterThread lt2 = new LetterThread(stringBuilder);
        LetterThread lt3 = new LetterThread(stringBuilder);
        lt1.start();
        lt2.start();
        lt3.start();
    }
}
