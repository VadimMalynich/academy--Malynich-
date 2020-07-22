package by.academy.classwork.oop.task11;


public class Circle extends Shape {
    private int x, y, r;

    public Circle(int x, int y, int r, String color) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Координаты " + color + " круга: x = " + x + ", y = " + y + ", radius = " + r);
    }
}
