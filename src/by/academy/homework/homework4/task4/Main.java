package by.academy.homework.homework4.task4;

public class Main {
    public static void main(String[] args) throws CustomException {
        Integer array[] = new Integer[8];
        try {
            for (int i = 0; i < 10; i++) {
                array[i] = (int) Math.random();
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array is to small, expand the array");
            throw new CustomException("error", ex);
        }
    }
}