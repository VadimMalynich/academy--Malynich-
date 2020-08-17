package by.academy.homework.homework4.task1;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {
    private T array[][];
    private Integer counter1 = 0;
    private Integer counter2 = 0;

    public CustomIterator(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (array[counter1].length == counter2) {
            counter2 = 0;
            if (array.length == counter1 + 1) {
                return false;
            } else {
                counter1++;
            }
        }
        return array != null /*&& array[counter1][counter2] != null*/ && array[counter1].length > counter2 && array.length > counter1;
    }

    @Override
    public T next() {
        return array[counter1][counter2++];
    }
}
