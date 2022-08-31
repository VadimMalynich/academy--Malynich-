package by.academy.classwork.lesson18;

public class Order {
    private String orderNo;
    private OrderItem orderItem;

    public Order(String orderNo, double itemPrice, int quantity) {
        this.orderNo = orderNo;
        this.orderItem = new OrderItem(itemPrice, quantity);
    }

    public void printInfo() {
        System.out.println("Order№: " + orderNo + "\nOrder price: " + orderItem.getItemPrice() + "\nQuantity: " + orderItem.getQuantity());
    }
}
