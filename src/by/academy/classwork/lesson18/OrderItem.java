package by.academy.classwork.lesson18;

public class OrderItem {
    private double itemPrice;
    private int quantity;

    public OrderItem(double itemPrice, int quantity) {
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
