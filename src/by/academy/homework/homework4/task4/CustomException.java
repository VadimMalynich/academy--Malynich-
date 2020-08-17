package by.academy.homework.homework4.task4;

public class CustomException extends Exception {
    public CustomException() {
        super();
    }

    public CustomException(String message) {
        System.out.println(message);
    }

    public CustomException(Throwable error) {
        System.out.println("Cause of exception " + error);
    }

    public CustomException(String message, Throwable error) {
        super(message);
        System.out.println("CustomException cause: " + error);
    }
}
