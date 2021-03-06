package by.academy.deal2;

public class Product {
    private double price;
    private String name;
    private double discount;

    Product(){
        super();
    }

    Product(double price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    Product(double price, String name, double discount) {
        super();
        this.price = price;
        this.name = name;
        this.discount = discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return (1 - discount / 100) * getPrice();
    }
}