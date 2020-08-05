package by.academy.classwork.lesson12.task5;

import by.academy.classwork.lesson9.box.Box;

import java.util.Comparator;

public class HeavyBox /*extends Box*/ implements Comparable {
    private int width;
    private int height;
    private int depth;
    private int weight;

    public HeavyBox() {
        super();
    }

    HeavyBox(int w, int h, int d, int m) {
        this.width = w;
        this.height = h;
        this.depth = d;
        this.weight = m;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public int getWeight() {
        return weight;
    }

    public void add(int w, int h, int d, int m) {
        this.width = w;
        this.height = h;
        this.depth = d;
        this.weight = m;
    }

    @Override
    public int compareTo(Object o) {
        if (o.equals(this.weight)) {
            return -1;
        }
        else if (o.equals(this.weight)) {
            return 1;
        }
        else if (o.equals(this.weight)) {
            return 0;
        }
        return 0;
    }
}
