package by.academy.classwork.lesson18;

import java.util.Arrays;

public class Customer {
    private String name;
    private Address address;
    private Order order;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Customer(String name, Address address, String orderNo, double itemPrice, int quantity) {
        this.name = name;
        this.address = address;
        createOrder(orderNo, itemPrice, quantity);
    }

    protected void createOrder(String orderNo, double itemPrice, int quantity) {
        this.order = new Order(orderNo, itemPrice, quantity);
    }

    public void printOrderInfo() {
        System.out.println("Order info");
        order.printInfo();
        System.out.println("\nOrder address");
        address.printAddress();
    }
}
