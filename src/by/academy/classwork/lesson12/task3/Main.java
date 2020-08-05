package by.academy.classwork.lesson12.task3;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {2, 3, 4, 5, 6, null, null, null};
        CustomIterator<Integer> itr = new CustomIterator<>(array);

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
