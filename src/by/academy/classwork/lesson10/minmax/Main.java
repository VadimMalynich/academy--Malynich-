package by.academy.classwork.lesson10.minmax;

public class Main {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (-100 + Math.random() * 202);
        }
        MinMax<Integer> mm = new MinMax<>(arr1);
        mm.print();
        System.out.println("\n" + mm.findMax());
        System.out.println(mm.findMin());

        System.out.println();
        Float arr2[] = new Float[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float) (-100 + Math.random() * 202);
        }
        MinMax<Float> MM = new MinMax<>(arr2);
        MM.print();
        System.out.println("\n" + MM.findMax());
        System.out.println(MM.findMin());

        System.out.println(mm.compareMin(MM));
        System.out.println(mm.compareMax(MM));
    }

}
