package by.academy.classwork.oop.task11;

public class Main {
    public static void main(String[] args) {
        Circle circle[] = new Circle[3];
        Circle circle1 = new Circle(2, 0, 5, "Green");
        circle[0] = circle1;
        circle1 = new Circle(-3, 5, 1, "Red");
        circle[1] = circle1;
        circle1 = new Circle(0, -4, 3, "Yellow");
        circle[2] = circle1;
        for (Circle cr : circle) {
            cr.draw();
        }
        System.out.println();
        Rectangle rec = new Rectangle("Blue");
        Rectangle rectangle[] = new Rectangle[4];
        Rectangle rectangle1 = new Rectangle(1, 1);
        rectangle[0] = rectangle1;
        rectangle1 = new Rectangle(1, 5);
        rectangle[1] = rectangle1;
        rectangle1 = new Rectangle(5, 5);
        rectangle[2] = rectangle1;
        rectangle1 = new Rectangle(5, 1);
        rectangle[3] = rectangle1;
        rec.draw(rectangle);
    }
}
