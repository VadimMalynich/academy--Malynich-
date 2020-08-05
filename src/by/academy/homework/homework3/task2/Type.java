package by.academy.homework.homework3.task2;

public class Type<T> {
    private T array[];
    private int count = 0;

    public Type() {
        super();
        array = (T[]) new Object[16];
    }

    public Type(int size) {
        super();
        array = (T[]) new Object[size];
    }

    public T[] getArray() {
        return array;
    }

    public void add(T obj) {
        int i = 0;
        for (T arr : array) {
            if (arr == null) {
                break;
            }
            i++;
        }
        if (i == array.length) {
            T temp[] = (T[]) new Object[array.length + 1];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
        array[count++] = obj;
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public T get(int i) {
        if (i < array.length && i >= 0) {
            return array[i];
        } else {
            System.out.println("Out of bounds of array!");
            return null;
        }
    }

    public T getLast() {
        return array[array.length - 1];
    }

    public T getFirst() {
        return array[0];
    }

    public int getArrayLength() {
        return array.length;
    }

    public void printArrayLength() {
        System.out.println("Array length: " + array.length);
    }

    public void getLastFillElementIndex() {
        /*int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                counter = i;
            }
        }*/
        System.out.println("Last fill element have index = " + (count - 1));
    }

    public void remove(int i) {
        T temp[] = (T[]) new Object[array.length];
        System.arraycopy(array, 0, temp, 0, i);
        System.arraycopy(array, i + 1, temp, i, array.length - i - 1);
        array = temp;
        count--;
    }

    public void remove(T obj) {
        int counter = -1;
        for (int i = 0; i < array.length; i++) {
            if (obj == array[i]) {
                counter = i;
                break;
            }
        }
        if (counter != -1) {
            T temp[] = (T[]) new Object[array.length];
            System.arraycopy(array, 0, temp, 0, counter);
            System.arraycopy(array, counter + 1, temp, counter, array.length - counter - 1);
            array = temp;
            count--;
        } else {
            System.out.println("There is no such element in the array!");
        }
    }
}
