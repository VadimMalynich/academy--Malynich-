package by.academy.classwork.oop.task11;

public abstract class Shape {
    protected String color;

    public abstract void draw();

    public Shape() {
        super();
    }

    public Shape(String color) {
        super();
        this.color = color;
    }
}
