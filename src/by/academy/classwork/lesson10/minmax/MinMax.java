/*Написать обобщенный класс MinMax, который содержит методы для
нахождения минимального и максимального элемента массива.
Массив является переменной класса. Массив должен передаваться в класс через конструктор.*/
package by.academy.classwork.lesson10.minmax;

public class MinMax<T extends Number/*, V extends Number*/> {
    private T arr[];

    public MinMax(T[] arr) {
        super();
        this.arr = arr;
    }

    public T findMin() {
        T min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].doubleValue() < min.doubleValue()) {
                min = arr[i];
            }
        }
        return min;
    }

    public T findMax() {
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].doubleValue() > max.doubleValue()) {
                max = arr[i];
            }
        }
        return max;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public boolean compareMin(MinMax<?> x){
        return findMin() == x.findMin();
    }

    public boolean compareMax(MinMax<?> x){
        return findMax() == x.findMax();
    }
}
