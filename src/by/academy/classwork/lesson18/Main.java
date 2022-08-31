package by.academy.classwork.lesson18;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(50, "Pyshkinskaya", "Minsk", "225305");
        Customer customer = new Customer("Василий", address, "52", 63.02, 2);
        customer.printOrderInfo();
    }
}