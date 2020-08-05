package by.academy.deal2;

public class Biscuits extends Product {
    Biscuits() {
        super();
    }

    public Biscuits(double price, String name) {
        super(price, name);
    }

    public double getDiscount(int quantity) {
        if (quantity > 3) {
            double discount = 13;
            System.out.print("Цена за товар \"" + getName() + "\", количеством " + quantity + ": ");
            return (1 - discount / 100) * getPrice() * quantity;
        } else {
            double discount = 2;
            System.out.print("Цена за товар \"" + getName() + "\", количеством " + quantity + ": ");
            return (1 - discount / 100) * getPrice() * quantity;
        }
    }
}