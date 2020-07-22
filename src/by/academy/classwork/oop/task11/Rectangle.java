package by.academy.classwork.oop.task11;

public class Rectangle extends Shape {
    private int x, y;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void draw() {
        System.out.println("Координаты " + color + " квадрата");
    }

    public void draw(Rectangle rectangle[]) {
        draw();
        int k = 1;
        for (Rectangle rc : rectangle) {
            System.out.println(" x" + k + " = " + rc.getX() + ", y" + k + " = " + rc.getY());
            k++;
        }
        System.out.println("");
    }
}
