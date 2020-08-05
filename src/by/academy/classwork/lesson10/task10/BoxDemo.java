/*Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
	Реализовать метод:
	а) который возвращает элемент по индексу (проверка границ массива)
	б) который добавляет элемент в конец массива (проверка границ массива)
	в) который добавление элемента в массив по индексу(проверка границ, сдвиг массива)
	нужно учесть, что если массив заполнен, увеличиваем массив в 2 раза*/
package by.academy.classwork.lesson10.task10;


public class BoxDemo<T> {
    private T[] array;
    private int counter = 0;

    @SuppressWarnings("unchecked")
    public BoxDemo() {
        super();
        array = (T[]) new Object[16];
    }

    public BoxDemo(int size) {
        super();
        array = (T[]) new Object[size];
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T getItem(int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Оut of bounds of array!");
            return null;
        } else {
            return array[index];
        }
    }

    public void add(T item) {
        if (array == null) {
            return;
        }
        if (counter == array.length) {
            T[] temp = (T[]) new Object[array.length * 2 + 1];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
        array[counter++] = item;
    }

    public void addToEnd(T item) {
        if (array == null) {
            return;
        }
        array[array.length - 1] = item;
        counter = array.length;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void addToIndex(T item, int index) {
        if (index < 0) {
            System.out.println("Index more than array length");
            return;
        }
        if (index > array.length - 1) {
            T[] temp = (T[]) new Object[index + 1];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
        array[index] = item;
        counter = index + 1;
    }
}




