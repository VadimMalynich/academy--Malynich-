package by.academy.deal2;

public class IceCream extends Product {
    IceCream() {
        super();
    }

    public IceCream(double price, String name) {
        super(price, name);
    }

    public double getDiscount(int quantity) {
        if (getName().length() > 16) {
            double discount = 10;
            System.out.print("Цена за товар \"" + getName() + "\", количеством " + quantity + ": ");
            return (1 - discount / 100) * getPrice() * quantity;
        } else {
            double discount = 5;
            System.out.print("Цена за товар \"" + getName() + "\", количеством " + quantity + ": ");
            return (1 - discount / 100) * getPrice() * quantity;
        }
    }
}