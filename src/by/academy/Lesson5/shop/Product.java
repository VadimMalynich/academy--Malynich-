package by.academy.Lesson5.shop;

public class Product {
    private double price;
    private String name;

    Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void setPrice(float price) {
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

}

