package by.academy.homework.homework4.task1;

public class Main {
    public static void main(String[] args) {
        int c1 = 0, c2 = 0;
        Integer array[][] = {{null, null, null}, {58, null, 2, 36}, {15, 22, null, 555, 4}};
        CustomIterator<Integer> it = new CustomIterator<>(array);
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
            c2++;
            if (array[c1].length == c2) {
                c1++;
                c2 = 0;
                System.out.println();
            }
        }
    }
}
